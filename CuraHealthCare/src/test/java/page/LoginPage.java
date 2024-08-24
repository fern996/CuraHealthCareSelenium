package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable.Base;

public class LoginPage extends Base {
	@FindBy(xpath="//button[@id='btn-login']")
	private WebElement link_loginBtn;
	
	@FindBy(xpath="//input[@id='txt-username']")
	private WebElement link_username;
	
	@FindBy(xpath="//input[@id='txt-password']")
	private WebElement link_password;
	
	@FindBy(xpath="//input[@aria-describedby='demo_username_label']")
	private WebElement link_demoUser;
	
	@FindBy(xpath="//input[@aria-describedby='demo_password_label']")
	private WebElement link_demoPassword;
	
	@FindBy(xpath="//p[@class='lead text-danger']")
	private WebElement link_loginFailedTxt;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void type_Username(String a) {
		link_username.sendKeys(a);
	}
	
	public void type_Password(String a) {
		link_password.sendKeys(a);
	}
	
	public void click_Login() {
		link_loginBtn.click();
	}
	
	public String get_DemoUser() {
		String gettext = link_demoUser.getAttribute("value");
		return gettext;
	}
	
	public String get_DemoPassowrd() {
		String gettext = link_demoPassword.getAttribute("value");
		return gettext;
	}
	
	public boolean is_LoginFailed() {
		return link_loginFailedTxt.isDisplayed();
	}
}