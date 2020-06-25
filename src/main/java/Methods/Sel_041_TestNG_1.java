package Methods;

import java.sql.Driver;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_041_TestNG_1 {
	
	public static WebDriver driver;
	By email = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");
	By bodyText = By.xpath("//div[@class='private-alert__inner']/h5");
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	}
	
	
	@Test(priority=1, description="This method gets title")
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	 @Test(priority=2, description="Login system using invalid username invalid pass")
	 public void invalidCredentials() {
	   getElement(driver, email).sendKeys("ilhan@sample.com");
	   getElement(driver, password).sendKeys("aboo123");
	   getElement(driver, loginBtn).click();
	   String text = getElement(driver, bodyText).getText();
	   System.out.println(text);
	   Assert.assertEquals(text, "That email address doesn't exist.");
		 
	 }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
	}

}
