package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable.Base;

public class LandingPage extends Base {
	@FindBy(id="btn-make-appointment")
	private WebElement make_appointment;

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void click_make_appointment() {
		make_appointment.click();
	}
}