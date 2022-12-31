package com.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.Base;
import com.naukri.propertices.ConfigHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\ELCOT\\eclipse-workspace\\Naukri\\src\\test\\java\\com\\feature\\Naukri.feature",
				glue = "com.stepdefintion",
				
				monochrome = true,
				plugin = {"pretty",
						"html:Report/Naukri.html",
						"json:Report/Naukri.json",
						"junit:Report/Naukri.xml"})

public class NaukriRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws IOException {
		String browser = ConfigHelper.getInstance().getBrowser();
		driver= Base.browserLaunch(browser);
	}
	@AfterClass
	public static void setDown() {
		driver.quit();
	}
	
	

}
