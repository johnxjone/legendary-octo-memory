package LoginSteps;

import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
	
	static WebDriver driver;
	public static TakesScreenshot gerDriver;
	
	@BeforeAll
	public static void main() {

		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
	}
	@AfterAll
	public static void taredown() {
		
		driver.quit();

	}

	public static WebDriver getDriver() {
		
		return driver;
		
	}

}
