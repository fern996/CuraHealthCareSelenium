package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.LandingPage;
import page.LoginPage;
import reusable.Base;

public class LoginTests extends Base{
	LandingPage landp;
	LoginPage logp;
	
	@BeforeTest
	public void setup() {
		initialization();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void successfulLogin() throws InterruptedException{
		landp = new LandingPage();
		logp = new LoginPage();
		landp.click_makeAppointment();
		logp.type_Username(logp.get_DemoUser());
		logp.type_Password(logp.get_DemoPassowrd());
		logp.click_Login();
	}
	
}
