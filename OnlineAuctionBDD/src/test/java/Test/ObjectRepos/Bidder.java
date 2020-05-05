package Test.ObjectRepos;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Utils.TestBase;

public class Bidder extends TestBase{
	
	public  Bidder()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="productname")
	WebElement getProductname;

	@FindBy(id="adcart")
	WebElement addCartbtn;
	
	@FindBy(name="userName")
	WebElement userNametxt;
	
	@FindBy(name="amount")
	WebElement amounttxt;
	
	@FindBy(name="email")
	WebElement emailtxt;
	
	@FindBy(name="phoneNumber")
	WebElement phoneNumbertxt;
	
	@FindBy(name="address")
	WebElement addresstxt;
	
	@FindBy(name="Bidid")
	WebElement bidbtn;
	
	@FindBy(xpath="//a[contains(text(),'back to Home Page')]")
	public WebElement homepagelink;
	
	public void createBid(String username,String amount, String email, String Phonenumber,String Address)
	{
		addCartbtn.click();
		userNametxt.sendKeys(username);
		amounttxt.sendKeys(amount);
		emailtxt.sendKeys(email);
		phoneNumbertxt.sendKeys(Phonenumber);
		addresstxt.sendKeys(Address);
		bidbtn.click();
	}
	
	public String getProductName()
	{
		String product= getProductname.getText();
		
		return product;
	}
	
	
}
