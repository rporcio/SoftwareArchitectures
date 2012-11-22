package hu.bme.aut.procureofmaterials.server;

import java.io.File;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.ConnectionPoolDataSource;

import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.IDBStore;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.emf.cdo.spi.server.InternalRepository;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.db.DBUtil;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.IDBConnectionProvider;
import org.eclipse.net4j.db.h2.H2Adapter;
import org.eclipse.net4j.jvm.JVMUtil;
import org.eclipse.net4j.tcp.ITCPAcceptor;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.net4j.util.security.UserManager;
import org.h2.jdbcx.JdbcConnectionPool;

public class CdoServer {

	private static final String CDO_DATABASE = "MaterialsDatabase";
	private IPluginContainer container = IPluginContainer.INSTANCE;
	private InternalRepository repository;
	private CDOSessionManager sessionManager;

	public void start() {
		init4j();
		initCdo();
		System.out.println("Server initialized!");
	}

	public void stop() {
		if (repository != null) {
			LifecycleUtil.deactivate(repository);
		}
		if (container != null) {
			LifecycleUtil.deactivate(container);
		}
		if (sessionManager != null) {
			LifecycleUtil.deactivate(sessionManager);
		}
		System.out.println("Server shutdown");
	}

	private void init4j() {
		Net4jUtil.prepareContainer(container);
		JVMUtil.prepareContainer(container); // Prepare the JVM transport
		TCPUtil.prepareContainer(container); // Prepare the TCP transport
		CDONet4jUtil.prepareContainer(container); // Prepare the CDO client
		CDONet4jServerUtil.prepareContainer(container); // Prepare the CDO
		// server

		container.activate();
		ITCPAcceptor acceptor = TCPUtil.getAcceptor(container, null);
		String msg = acceptor == null ? "TCP listen cannot be initialized!" : String.format("TPC listen initialized on: %s:%s", acceptor.getAddress(), acceptor.getPort());
		System.out.println(msg);
		JVMUtil.getAcceptor(container, CDO_DATABASE);
	}

	private void initCdo() {
		String namespace = "net4j.db.datasource";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(namespace + ".class", "org.h2.jdbcx.JdbcDataSource");
		map.put(namespace + ".uRL", getJdbcUrl());
		map.put(namespace + ".user", "");
		map.put(namespace + ".password", "");

		ConnectionPoolDataSource dataSource = (ConnectionPoolDataSource) DBUtil.createDataSource(map, namespace);
		JdbcConnectionPool connectionPool = JdbcConnectionPool.create(dataSource);
		connectionPool.setMaxConnections(20);
		IDBConnectionProvider connectionProvider = DBUtil.createConnectionProvider(connectionPool);

		IDBStore DBStore = createDBStore(connectionProvider);
		createRepository(DBStore, container);
	}

	private IDBStore createDBStore(IDBConnectionProvider connectionProvider) {
		IMappingStrategy mappingStrategy = CDODBUtil.createHorizontalMappingStrategy(true, true, true);

		Map<String, String> properties = new HashMap<String, String>();
		properties.put(IMappingStrategy.PROP_QUALIFIED_NAMES, "true");
		mappingStrategy.setProperties(properties);

		IDBAdapter dbAdapter = new H2Adapter() {
			@Override
			public boolean isDuplicateKeyException(SQLException ex) {
				// Changed in H2 1.3.154: SQL code for duplicate keys is 23505
				return "23505".equals(ex.getSQLState());
			}

		};

		return CDODBUtil.createStore(mappingStrategy, dbAdapter, connectionProvider);
	}

	@SuppressWarnings("restriction")
	private void createRepository(IDBStore dBStore, IPluginContainer container2) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(IRepository.Props.OVERRIDE_UUID, CDO_DATABASE);
		map.put(IRepository.Props.SUPPORTING_AUDITS, "true");
		map.put(IRepository.Props.SUPPORTING_BRANCHES, "true");

		repository = (InternalRepository) CDOServerUtil.createRepository(CDO_DATABASE, dBStore, map);

		UserManager manager = new UserManager();
		manager.activate();
		sessionManager = new CDOSessionManager();
		sessionManager.setUserManager(manager);

		repository.setSessionManager(sessionManager);
		CDOServerUtil.addRepository(container, repository);
	}

	public String getJdbcUrl() {
		return String.format("jdbc:h2:%s%s%s;DB_CLOSE_DELAY=-1;LOCK_TIMEOUT=600000;CACHE_SIZE=131072", "~/materials", File.separator, CDO_DATABASE);
	}

}
