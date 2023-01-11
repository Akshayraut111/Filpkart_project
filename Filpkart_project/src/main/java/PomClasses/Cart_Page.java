package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class Cart_Page extends UtilClass1{
	
	
WebDriver driver;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton1;
	
	
	public Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void checkLoginButtonAvailable() {
		
		try {
			loginButton1.isDisplayed();
			
			System.out.println("No Products in cart");
			
		}catch(Exception e)
		{
			System.out.println("LoginButton is not visible");
		}
		
	}

}
