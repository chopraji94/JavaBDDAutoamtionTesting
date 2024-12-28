package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import StepDefinitions.BaseSteps;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class TestHooks {

	WebDriver _driver;

	@Before
	public void SetUpBrowser() {
		_driver = new ChromeDriver();
		_driver.manage().window().maximize();
		_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		BaseSteps.driver = _driver;
	}
	
	@BeforeStep
	public void BeforeStep() {
		System.out.println("Insdie before step");
	}
	
	@AfterStep
	public void AfterStep() {
		System.out.println("Inside after step");
	}

	@After
	public void TearDown() {
		_driver.close();
		_driver.quit();
	}

}
