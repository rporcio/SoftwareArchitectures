package hu.bme.aut.procurementofmaterials;

import java.util.UUID;


public class IDGenerator {
	public static String generateUniqueID() {
		return UUID.randomUUID().toString();
	}
}
