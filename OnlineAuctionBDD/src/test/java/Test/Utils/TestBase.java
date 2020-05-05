package Test.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	 public static void initialization()
	 {
		
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		 driver= new ChromeDriver(); 
		 driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		 driver.get("http://localhost:8081/OnlineAuction/login.jsp");
		 
		 }

}
