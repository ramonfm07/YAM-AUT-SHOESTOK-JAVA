package teste.setup;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	//public static ResourceBundle bundle = ResourceBundle.getBundle("project");
	
	
	@Before
	public void startTest(Scenario scenario) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		//driver.manage().window().maximize();
		driver.get("https://www.shoestock.com.br/");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		//driver.get(bundle.getString("env.url"));
		
			
	}
	
	@After
	public void tearDown(Scenario scenario) { 
		driver.close();
	}
	
	public static WebDriver getDriver() { 
		return driver;
	}

}



