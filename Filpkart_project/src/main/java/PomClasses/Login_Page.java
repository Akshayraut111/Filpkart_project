package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class Login_Page extends UtilClass1{
	
WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginButton;
	
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void putEmail()
	{
		email.sendKeys("akshaynarhare1541@gmail.com");
	}
	
	public void putPassword()
	{
		password.sendKeys("Akshay123");
	}
	
	public void clickLoginBtn()
	{
		loginButton.click();
	}
	

}
