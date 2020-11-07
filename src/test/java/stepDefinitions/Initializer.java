package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import core.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer extends Base {
	
	@Before
	public void beforeHooks(Scenario scenario) {
		
		logger.info("Scenario " + scenario.getName() + "Started" );
		
		String browser = getBrowserName();
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(getPageLoadTimeOut(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getImpWait(), TimeUnit.SECONDS);
		
		
		
	}
	
	
	
	@After
	public void afterHooks(Scenario scenario) {
		
		tearDown();
		
		logger.info(scenario.getName() + "  " + scenario.getStatus());
		
	}

	

	}
