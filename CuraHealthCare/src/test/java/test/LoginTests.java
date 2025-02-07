package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.LandingPage;
import page.LoginPage;
import reusable.Base;

public class LoginTests extends Base{
	LandingPage landp;
	LoginPage logp;
	String expected_url = "https://katalon-demo-cura.herokuapp.com/#appointment";
	@BeforeTest
	public void setup() {
		initialization();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	@Test()
	public void successfulLogin() throws InterruptedException{
		landp = new LandingPage();
		logp = new LoginPage();
		landp.click_makeAppointment();
		logp.type_Username(logp.get_DemoUser());
		logp.type_Password(logp.get_DemoPassowrd());
		logp.click_Login();
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,expected_url);
	}
	
	@Test()
	public void badUser() throws InterruptedException{
		landp = new LandingPage();
		logp = new LoginPage();
		landp.click_makeAppointment();
		logp.type_Username("test");
		logp.type_Password(logp.get_DemoPassowrd());
		logp.click_Login();
		Assert.assertEquals(true,logp.is_LoginFailed());
	}
	
	@Test()
	public void badPassword() throws InterruptedException{
		landp = new LandingPage();
		logp = new LoginPage();
		landp.click_makeAppointment();
		logp.type_Username(logp.get_DemoUser());
		logp.type_Password("test");
		logp.click_Login();
		Assert.assertEquals(true,logp.is_LoginFailed());
	}
	
	@Test()
	public void blankUser() throws InterruptedException{
		landp = new LandingPage();
		logp = new LoginPage();
		landp.click_makeAppointment();
		logp.type_Username("");
		logp.type_Password(logp.get_DemoPassowrd());
		logp.click_Login();
		Assert.assertEquals(true,logp.is_LoginFailed());
	}
	
	@Test()
	public void blankPassword() throws InterruptedException{
		landp = new LandingPage();
		logp = new LoginPage();
		landp.click_makeAppointment();
		logp.type_Username(logp.get_DemoUser());
		logp.type_Password("");
		logp.click_Login();
		Assert.assertEquals(true,logp.is_LoginFailed());
	}
	
	@Test()
	public void blankFields() throws InterruptedException{
		landp = new LandingPage();
		logp = new LoginPage();
		landp.click_makeAppointment();
		logp.type_Username("");
		logp.type_Password("");
		logp.click_Login();
		Assert.assertEquals(true,logp.is_LoginFailed());
	}
}

