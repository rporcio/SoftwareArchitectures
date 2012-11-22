package hu.bme.aut.procurementofmaterials.authenticator;


public class UserAuthenticator {

	private static String USER_NAME_MANAGER = "Manager";
	private static String USER_PASSWORD_MANAGER = "x";
	private static String USER_NAME_SUPPLIER = "Supplier";
	private static String USER_PASSWORD_SUPPLIER = "x";
	private static String USER_NAME_PRODUCER = "Producer";
	private static String USER_PASSWORD_PRODUCER = "x";
	
	private String user;

	private static UserAuthenticator instance;
	
	private UserAuthenticator() {
		user = "";
	}
	
	public static UserAuthenticator getInstance() {
		if (null == instance) {
			instance = new UserAuthenticator();
		}
		
		return instance;
	}
	
	public boolean authenticate(String userName, String userPassword) {
		if (userName.equals(USER_NAME_MANAGER) && userPassword.equals(USER_PASSWORD_MANAGER)) {
			user = "manager";
			return true;
		} else if (userName.equals(USER_NAME_SUPPLIER) && userPassword.equals(USER_PASSWORD_SUPPLIER)) {
			user = "supplier";
			return true;
		} else if (userName.equals(USER_NAME_PRODUCER) && userPassword.equals(USER_PASSWORD_PRODUCER)) {
			user = "producer";
			return true;
		}
		return false;
	}
	
	public int getUserType() {
		if (user.equals("manager")) {
			return 0;
		} else if (user.equals("producer")) {
			return 1;
		} else if (user.equals("supplier")) {
			return 2;
		}
		
		return -1;
	}
}
