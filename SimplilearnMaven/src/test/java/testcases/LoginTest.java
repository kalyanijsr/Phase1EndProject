package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends Baseclass{

@Test
public void test1() {
	
	LoginFunction("abc@xyz.com","Abc@1234");
	
	WebElement error = driver.findElement(By.id("msg_box"));
	String ActError = error.getText();
	String ExpError = "The email or password you have entered is invalid...";
	
	Assert.assertEquals(ActError, ExpError);
	
}
@Test
public void test2() {
	
	LoginFunction("abc@xyz.com","Abc@1234");
			
	

	}
	
	public void LoginFunction(String UserNameval,String PwdVal) {
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys(UserNameval);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(PwdVal);
		
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		WebElement loginBtn= driver.findElement(By.name("btn_login"));
		loginBtn.click();
	}


		
	}
 

	
	





	
