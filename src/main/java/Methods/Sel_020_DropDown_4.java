package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_020_DropDown_4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		selectDropDownByIndex(driver, day, 9);
		selectDropDownByIndex(driver, month, 9);
		selectDropDownByIndex(driver, year, 9);
		

	}
	
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public static void selectDropDownByIndex(WebDriver driver, By locator, int index) {
		
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	/**
	 * This method is used to get element
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
		
	}

	

}
