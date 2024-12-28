package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Refer chat gpt constructor calling => https://chatgpt.com/share/676fcd46-139c-8000-9a2c-da20822754b0

public class LoginpageForDemo {

	WebDriver driver;

	// APPROACH 1
	/*
	 * private WebElement userName_Txtbox; private WebElement userPassword_Txtbox;
	 * private WebElement submitButton;
	 */

	/*
	 * public LoginpageForDemo(WebDriver driver) { this.driver = driver;
	 * init_elements(); }
	 */

	// This i have done so as to follow constructor rule
	// Rule -> If there are any static/nomal variabe initailized anything and call
	// any type of constructor then it first variables get initalized and then the
	// contsructor is called
	// because of which driver was getting value after variables were intaialized
	// given null reference to driver
	/*
	 * private void init_elements() { userName_Txtbox =
	 * driver.findElement(By.id("username")); userPassword_Txtbox =
	 * driver.findElement(By.id("password")); submitButton =
	 * driver.findElement(By.id("submit")); }
	 */

	// Approach2
	
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_submit = By.id("submit");
	
	// This i have done so as to follow constructor rule
	// Rule -> If there are any static/nomal variabe initailized anything and call
	// any type of constructor then it first variables get initalized and then the
	// contsructor is called
	// because of which driver was getting value after variables were intaialized
	// given null reference to driver
	public LoginpageForDemo(WebDriver driver) {
		this.driver = driver;
	}

	public void enteruserName(String userName) {
		driver.findElement(txt_username).sendKeys(userName);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickSubmitButton() {
		driver.findElement(btn_submit).click();
	}
}
