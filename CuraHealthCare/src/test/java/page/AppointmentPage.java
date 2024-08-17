package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import reusable.Base;

public class AppointmentPage extends Base {
	@FindBy(xpath="//select[@id='combo_facility']")
	public WebElement link_Facilities;
	
	@FindBy(xpath="//input[@id='chk_hospotal_readmission']")
	public WebElement link_ReadmissionCheck;
	
	@FindBy(xpath="//input[@id='radio_program_medicare']")
	public WebElement link_Medicare;
	
	@FindBy(xpath="//input[@id='radio_program_medicaid']")
	public WebElement link_Medicaid;
	
	@FindBy(xpath="//input[@id='radio_program_none']")
	public WebElement link_None;
	
	@FindBy(xpath="//input[@id='txt_visit_date']")
	public WebElement link_VisitDate;
	
	@FindBy(xpath="//textarea[@id='txt_comment']")
	public WebElement link_Comment;
	
	@FindBy(xpath="//button[@id='btn-book-appointment']")
	public WebElement link_BookAppointmentBtn;


	public AppointmentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void click_BookAppointment() {
		link_BookAppointmentBtn.click();
	}
	
	public void click_Readmission() {
		link_ReadmissionCheck.click();
	}
	
	public void click_Medicare() {
		link_Medicare.click();
	}
	
	public void click_Medicaid() {
		link_Medicaid.click();
	}
	
	public void click_None() {
		link_None.click();
	}
	
	public void click_Facility(int a) {
		Select dropdown = new Select(link_Facilities);
		dropdown.selectByIndex(a);
	}
	
	public void type_VisitDate(String a) {
		link_VisitDate.sendKeys(a);
	}
	
	public void type_Comment(String a) {
		link_Comment.sendKeys(a);
	}
}