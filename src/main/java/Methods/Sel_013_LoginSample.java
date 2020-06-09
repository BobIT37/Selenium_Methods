package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_013_LoginSample {
	
    public static WebDriver driver;
	
	static By email = By.id("username");
	static By password = By.xpath("//input[@id='password']");
	static By loginBtn = By.cssSelector("#loginBtn");

	public static void main(String[] args) throws InterruptedException {
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		ElementUtil.getElement(driver, email).sendKeys("boblerry@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("test123");
		ElementUtil.getElement(driver, loginBtn).click();
		ElementUtil.quitBrowser(driver);
		
		

	}

}
