package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage().window().maximize();
			
			WebElement scrollTo = driver.findElement(By.xpath("//h2[[text()='HTML Exercise']"));
			
			JavascriptExecuter obj =(JavascriptExecuter) driver;
			obj.executeScript("argument[0].scrollIntoView();",scrollTo);

	}

}
