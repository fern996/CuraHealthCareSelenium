package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable.Base;

public class LoginPage extends Base {
	@FindBy(xpath="//button[@id='btn-login']")
	private WebElement link_login_btn;
	
	@FindBy(xpath="//input[@id='txt-username']")
	private WebElement link_username;
	
	@FindBy(xpath="//input[@id='txt-password']")
	private WebElement link_password;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void type_Username(String a) {
		link_username.sendKeys(a);
	}
	
	public void type_Password(String a) {
		link_password.sendKeys(a);
	}
	
	public void login() {
		link_login_btn.click();
	}
}