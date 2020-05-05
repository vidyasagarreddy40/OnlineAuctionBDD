package Test.ObjectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Utils.TestBase;

public class Login extends TestBase {
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[contains(text(),'To bid')]")
	public WebElement ToBidlink;
	
	
	@FindBy(xpath="//a[contains(text(),'Seller')]")
	public WebElement ToSelllink;
	
	
	public void clickOnBid()
	{
		ToBidlink.click();
	}
	
	public void clickOnSeller()
	{
		ToSelllink.click(); 
	}
}
