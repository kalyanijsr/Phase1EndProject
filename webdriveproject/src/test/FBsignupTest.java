package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBsignupTest {

	public static <select> void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		WebElement signUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signUp.click();
		
		
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement IName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		fName.sendKeys("John");
		IName.sendKeys("white");
		mobile.sendKeys("9999999");
		password.sendKeys("Anc@1234");
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select ddDay = new Select(day);
	    ddDay.selectByVisibleText("10");
	    
	    WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select ddMonth = new Select(Month);
	    ddMonth.selectByVisibleText("Jan");
	    
	    WebElement year= driver.findElement(By.xpath("//select[@title='Year']"));
		Select ddYear = new Select(year);
	    ddYear.selectByVisibleText("2000");
	   
	    List<WebElement> list=driver.findElements(By.xpath("//select[@title='Month']/option"));
	    
	    for(WebElement month:list) {
	    	System.out.println(month.getText());
	    }
	    
	    WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
	    Female.click();
	    
	    String Gender = "Male";
	    
	    
	    
	    
	    		
	    
	
		}

}
