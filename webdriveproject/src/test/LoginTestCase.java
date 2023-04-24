package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	
		System.out.println("The title of the page is" + driver.getTitle());
		
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		String location = loginLink.getAttribute("href");
		System.out.println("The link will take you to" + location );
		
		loginLink.click();
		
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys("abc@xyz.com");
		
		WebElement id = driver.findElement(By.id("password"));
		userName.sendKeys("Abc@12345");
		
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		
		
		WebElement loginbtn= driver.findElement(By.name("btn_login"));
		loginbtn.click();
			
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		String expErrorMsg = "The email or password you have entered is invaild.";
		if (error.isDisplayed()&& errorMsg.equals(expErrorMsg)) {
			
			System.out.println("TC passed");
		}else {
			System.out.println("TC Failed");
			
			}
	     List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links are" + AllLinks.size());
		
		for(WebElement link: AllLinks) {
		System.out.println(link.getAttribute("href"));
				
		}
		
		driver.close();
	
	}
}