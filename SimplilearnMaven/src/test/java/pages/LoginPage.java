package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class LoginPage  {
	WebDriver driver;
	//=============================object===============================
	@FindBy(linkText= "Log in")
	WebElement loginLink;
	
	@FindBy(name="user_login")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="rememberMe") 
	WebElement RememberMe;
	
	@FindBy(name="btn_login")
	WebElement loginBtn;
	
	
	//===============================Methods=============================
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	

	public void LoginFunction(String UserNameval,String PwdVal) {
		
		loginLink.click();
	     userName.sendKeys(UserNameval);
		password.sendKeys(PwdVal);
		RememberMe.click();
		loginBtn.click();
	} 

}
