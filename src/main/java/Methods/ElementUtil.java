package Methods;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author bobit
 *
 */

public class ElementUtil {
	
	/**
	 * this method is used to handle alert
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alert  = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}
	
	/**
	 * This method is used to launch browser
	 * @param driver
	 * @param browserName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/bobit/Documents/Drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browser is not available "+ browserName);
		}
		return driver;
	}
	
	/**
	 * This method is used to launch URL
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	/**
	 * This method is used to get element
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		waitForPresenceOfElement(driver, locator);
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	
    public static void waitForPresenceOfElement(WebDriver driver, By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	/**
	 * This method is used to get title
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	/**
	 * This method is used to click on the element
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
	/**
	 * This method is used to close browser
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}
	
	/**
	 * This method is used to quit browser
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
	
	

}
