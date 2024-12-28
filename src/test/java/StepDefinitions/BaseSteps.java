package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.*;

public class BaseSteps {
	
	public static WebDriver driver;
	
	public LoginpageForDemo loginpageForDemo;
	public LoggedInpage loggedInpage;
	
	public BaseSteps() {
		
		if(loginpageForDemo == null) {
			loginpageForDemo = new LoginpageForDemo(driver);
		}
		
		if(loggedInpage == null) {
			loggedInpage = new LoggedInpage(driver);
		}
		
	}
}
