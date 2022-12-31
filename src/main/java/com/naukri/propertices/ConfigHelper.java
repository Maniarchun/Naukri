package com.naukri.propertices;

import java.io.IOException;



public class ConfigHelper {
	private ConfigHelper() {
		// TODO Auto-generated constructor stub
	}
	public static ConfigReader getInstance() throws IOException {
		ConfigReader cr = new ConfigReader();
		return cr;

	}
	
}
