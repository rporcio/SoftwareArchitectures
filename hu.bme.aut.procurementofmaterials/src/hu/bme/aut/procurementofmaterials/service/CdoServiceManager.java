package hu.bme.aut.procurementofmaterials.service;

import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.RepositoryNotFoundException;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.ConnectorException;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.security.PasswordCredentials;
import org.eclipse.net4j.util.security.PasswordCredentialsProvider;

public class CdoServiceManager {
	
	private static final String RESOURCE_NAME = "materialsdb";
	private static final String REPOSITORY_ADDRESS = "localhost:2036";
	private static final int SIGNAL_TIMEOUT = 10000;
	public static final String REPOSITORY_NAME = "MaterialsDatabase";
	public static final String USERNAME = "";
	public static final String PASSWORD = "";
	public static final Long PROTOCOL_TIMEOUT = 1000000L;
	public static final int COMMIT_TIMEOUT = 1000;
	
	private static CdoServiceManager instance;
	
	private CDONet4jSession cdoSession;
	
	private CdoServiceManager() {
		cdoSession = conncet();
		CDOUtil.setLegacyModeDefault(true);
		
	}
	
	public static CdoServiceManager getInstance() {
		if (null == instance) {
			synchronized (CdoServiceManager.class) {
				if (null == instance) {
					instance = new CdoServiceManager();
				}
			}
		}
		
		return instance;
	}
	
	public CDOTransaction openTransaction() {
		return cdoSession.openTransaction(getMainBranch());
	}

	public CDOView openView() {
		return cdoSession.openView(getMainBranch());
	}
	
	private CDOBranch getMainBranch() {
		return cdoSession.getBranchManager().getMainBranch();
	}
	
	private CDONet4jSession conncet() {
		try {
			IManagedContainer container = IPluginContainer.INSTANCE;
			PasswordCredentialsProvider credentialsProvider = new PasswordCredentialsProvider(new PasswordCredentials(USERNAME, PASSWORD.toCharArray()));
			CDONet4jSessionConfiguration sessionConfiguration = CDONet4jUtil.createNet4jSessionConfiguration();
			sessionConfiguration.getAuthenticator().setCredentialsProvider(credentialsProvider);
			sessionConfiguration.setRepositoryName(REPOSITORY_NAME);
			sessionConfiguration.setSignalTimeout(SIGNAL_TIMEOUT);

			Net4jUtil.prepareContainer(container);
			TCPUtil.prepareContainer(container);

			IConnector connector = TCPUtil.getConnector(container, REPOSITORY_ADDRESS);

			sessionConfiguration.setConnector(connector);

			CDONet4jSession session = sessionConfiguration.openNet4jSession();
			session.options().getNet4jProtocol().setTimeout(PROTOCOL_TIMEOUT);
			session.options().setCommitTimeout(COMMIT_TIMEOUT);
//			session.getPackageRegistry().putEPackage(PersonPackage.eINSTANCE);
			return session;
		} catch (ConnectorException e) {
			String msg = String.format("Could'nt connect to server at: %s", REPOSITORY_ADDRESS);
		} catch (RepositoryNotFoundException e) {
			String msg = String.format("Repository does'nt exist: %s", e.getRepositoryName());
		} catch (IllegalArgumentException e) {
			String msg = String.format("Invalid repository URL: %s", e.getMessage());
		}
		return null;
	}

	public String getResourcePath() {
		return RESOURCE_NAME;
	}
}