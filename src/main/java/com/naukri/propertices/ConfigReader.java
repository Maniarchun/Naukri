package com.naukri.propertices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties p;
	public ConfigReader() throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Naukri\\src\\main\\java\\com\\naukri\\propertices\\Naukri.properties");
		FileInputStream fi = new FileInputStream(f);
		p= new Properties();
		p.load(fi);
	}
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUserName() {
		String userName = p.getProperty("username");
		return userName;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getResume() {
		String resume = p.getProperty("resume");
		return resume;
	}
}
