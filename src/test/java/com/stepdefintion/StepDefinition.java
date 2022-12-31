package com.stepdefintion;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.Base;
import com.Runner.NaukriRunner;
import com.naukri.propertices.ConfigHelper;
import com.naukri.propertices.ConfigReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base {
	public static WebDriver driver = NaukriRunner.driver;

	@Given("user Launch The Application Url")
	public void user_Launch_The_Application_Url() throws IOException, InterruptedException {
		String url = ConfigHelper.getInstance().geturl();
		urlLaunch(url);
		sleep();

	}

	@When("user Click The Login")
	public void user_Click_The_Login() {

		WebElement logIn = driver.findElement(By.xpath("//a[@id='login_Layer']"));
		explicitLoad(logIn);
		logIn.click();
	}

	@When("user Enter The User Name")
	public void user_Enter_The_User_Name() throws IOException {
		WebElement userName = driver
				.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		explicitLoad(userName);
		userName.sendKeys(ConfigHelper.getInstance().getUserName());

	}

	@When("user Enther The Password")
	public void user_Enther_The_Password() throws IOException {
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		explicitLoad(password);
		password.sendKeys(ConfigHelper.getInstance().getPassword());

	}

	@Then("user Click The To Login")
	public void user_Click_The_To_Login() {

		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		explicitLoad(button);
		button.click();

	}

	@When("user Click The Profile Option Icon")
	public void user_Click_The_Profile_Option_Icon() throws InterruptedException {
		sleep();
		WebElement profileIcon = driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']"));
		explicitLoad(profileIcon);
		profileIcon.click();
	}

	@Then("user Click The Update Profile")
	public void user_Click_The_Update_Profile() {
		WebElement subButton = driver.findElement(By.xpath("//a[@class='nI-gNb-info__sub-link']"));
		explicitLoad(subButton);
		subButton.click();
	}

	@When("user Delete The Resume")
	public void user_Delete_The_Resume() throws InterruptedException {
		sleep();
		try {
			WebElement delete = driver.findElement(By.xpath("//a[@class='link right fs14 fw500']"));
			explicitLoad(delete);
			delete.click();
			try {
				WebElement confrim = driver
						.findElement(By.xpath("(//button[@class='waves-effect waves-light btn-large blue-btn'])[3]"));
				explicitLoad(confrim);
				confrim.click();
			}catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}


@When("user Upload The Resume")
public void user_Upload_The_Resume() throws IOException, InterruptedException {
	sleep();
	WebElement resume =driver.findElement(By.xpath("//input[@id='attachCV']"));
	resume.sendKeys(ConfigHelper.getInstance().getResume());
	sleep();
}

	@When("user Refresh The Page")
	public void user_Refresh_The_Page() throws InterruptedException {
		sleep();
		driver.navigate().refresh();

	}

	@When("user Again Click The Profile Option Icon")
	public void user_Again_Click_The_Profile_Option_Icon() throws InterruptedException {
		sleep();
		WebElement proIcon=driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']"));
		explicitLoad(proIcon);
		proIcon.click();
	}

	@Then("user Click The Logout")
	public void user_Click_The_Logout() throws InterruptedException {
		sleep();
		WebElement logOut=driver.findElement(By.xpath("//a[@title='Logout']"));
		explicitLoad(logOut);
		logOut.click();
		sleep();
	}

}
