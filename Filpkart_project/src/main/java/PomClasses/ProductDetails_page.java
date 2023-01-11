package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class ProductDetails_page extends UtilClass1{
	
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='BUY NOW']")
	private WebElement buyNowButton;
	
	
	
	public ProductDetails_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public boolean isBuyNowButtonIsAppeared()
	{
		try {
			WebElement element = expliciteWait(driver, buyNowButton);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	
	
	
	

}
