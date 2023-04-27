package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		
		
		WebDriverManager.chromedriver().setup();
		
		this.driver = new ChromeDriver();
		driver.get("http://www.simplilearn.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();

}
}