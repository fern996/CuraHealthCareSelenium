package reusable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	static FileInputStream fileInput;
	static Properties prop;
	public static ChromeDriver driver;
	protected WebDriverWait wait;
	
	public Base() {
		try {
			fileInput = new FileInputStream("src/main/resources/data/data.properties");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("browser"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	}
}
