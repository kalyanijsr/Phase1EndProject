package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("abc@xyz.com");
		
		WebElement passsword = driver.findElement(By.name("pass"));

		
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		
		
	}

}
