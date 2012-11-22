package hu.bme.aut.procureofmaterials.server;

import org.eclipse.emf.cdo.internal.server.SessionManager;
import org.eclipse.emf.cdo.spi.common.CDOAuthenticationResult;
import org.eclipse.emf.cdo.spi.server.ISessionProtocol;

public class CDOSessionManager extends SessionManager {

	/**
	 * Custom implementation to authenticate any user automatically. 
	 * At this point the user must be already authenticated, so there is no need for a second CDO authentication.
	 * 
	 */
	@Override
	protected String authenticateUser(ISessionProtocol protocol)
			throws SecurityException {
		
		/* 
		 * Required by Repository.initRootResource() which opens a session
		 * with a null session protocol (see also the authenticateUser method in this
		 * class' superclass)
		 */
		if (protocol == null) {
			return null;
		}
		
		try {
			byte[] randomToken = createRandomToken();
		    CDOAuthenticationResult result;
				result = protocol.sendAuthenticationChallenge(randomToken);
		    String userID = result.getUserID();
		    
		    return userID;
		} catch (Exception e) {
			throw new SecurityException(e);
		}
	}
	
}