package PomClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class Home_Page extends UtilClass1{
	
	
WebDriver driver;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[@class='YUhWwv']")
	private WebElement cartBtn;
	
	@FindBy(xpath="//div[text()='Akshay']")
	private WebElement profileName;
	
	@FindBy(xpath="(//div[@class=\"_2kHMtA\"])[1]")
	private WebElement productList;
	
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void enterSearchText(String search)
	{
		searchField.sendKeys(search);
	}
	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	public void clickCartButton()
	{
		cartBtn.click();
	}
	
	public boolean isProfileNameVisible()
	{
		
		try {
			WebElement element = expliciteWait(driver, profileName);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean isProductListAppeared()
	{
		try {
			WebElement element = expliciteWait(driver, productList);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public void clearSearchField(String searchData)
	{
		for(int a=0; a<searchData.length(); a++)
		{
			searchField.sendKeys(Keys.BACK_SPACE);
		}
	}
	
	public void clickOnFirstProduct()
	{
		productList.click();
		
		List<String> address = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(address.get(1));
			
	}

}
