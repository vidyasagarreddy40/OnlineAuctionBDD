package Test.ObjectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Utils.TestBase;

public class Seller extends TestBase{
	
	@FindBy(id="productid")
	public WebElement productname;
	
	@FindBy(id="createpid")
	public WebElement createProductbtn;
	
	
	@FindBy(id="getDetails")
	public WebElement getDetails;
	
	@FindBy(name="productName")
	public WebElement productNametxt;
	
	@FindBy(id="model")
	public WebElement modeltxt;
	
	@FindBy(id="createProduct")
	public WebElement createProductmodalbtn;
	
	@FindBy(id="closebtn")
	public WebElement closebtn;

	@FindBy(id="winner")
	public WebElement winnertxt;

	@FindBy(xpath="//a[contains(text(),'back to Home Page')]")
	public WebElement homepagelink;
	
	public Seller()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void createProduct(String ProductName, String Model)
	{
		createProductbtn.click();
		productNametxt.sendKeys(ProductName);
		modeltxt.sendKeys(Model);
		createProductmodalbtn.click();
	}
	
	public String getProductName()
	{
		String product=productname.getText();
		
		return product;
	}

}
