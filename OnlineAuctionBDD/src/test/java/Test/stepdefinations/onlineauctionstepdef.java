package Test.stepdefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Test.ObjectRepos.Bidder;
import Test.ObjectRepos.Login;
import Test.ObjectRepos.Seller;
import Test.Utils.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class onlineauctionstepdef extends TestBase{
	
public static WebDriver driver;
    
	Login login= new Login();
	Seller seller= new Seller();
	Bidder bidder= new Bidder();
	
	
	public  onlineauctionstepdef() {
		super();
	}
	
	@Before
	public void start()
	{
		Login login= new Login();
		TestBase.initialization(); 
	}

	
	@After
	public void tear()
	{
		driver.close();
	}
	
	
	@Given("^Navigate to Welcome Page and click on Seller$")
	public void navigate_to_Welcome_Page_and_click_on_Seller() throws Throwable {
		 login.clickOnSeller();
	}

	@When("^create Product as \"([^\"]*)\" \"([^\"]*)\"$")
	public void create_Product_as(String product,  String model)  throws Throwable {
		seller.createProduct(product, model);
	}

	@Then("^verify the alert$")
	public void verify_the_alert() throws Throwable {
		Alert alert= driver.switchTo().alert();
		String alerttext=alert.getText();
		String text="Product is created";
		Assert.assertEquals(alerttext, text);
	}

	@Given("^Navigate to Welcome Page and click on bidder$")
	public void navigate_to_Welcome_Page_and_click_on_bidder() throws Throwable {
		login.ToBidlink.click();
	}

	@When("^create bid as \"([^\"]*)\" & \"([^\"]*)\" & \"([^\"]*)\" & \"([^\"]*)\" & \"([^\"]*)\"$")
	public void create_bid_as(String name, String amount, String email, String phone, String address) throws Throwable {
		  bidder.createBid(name, amount, email, phone, address);
	}

	@Then("^verify the alert of bidding$")
	public void verify_the_alert_of_bidding() throws Throwable {
		Alert alert= driver.switchTo().alert();
		String alerttext=alert.getText();
		String text="Bid is created";
		Assert.assertEquals(alerttext, text);
	}
	
}
