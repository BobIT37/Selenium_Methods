package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_018_DropDown_2 {

	public static void main(String[] args) {
		
		//Set property
		System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        
//        selectDropDownValueByText(day, "13");
//        selectDropDownValueByText(month, "Jun");
//        selectDropDownValueByText(year, "2007");
        
        selectDropDownValueByIndex(day, 13);
        selectDropDownValueByIndex(month, 7);
        selectDropDownValueByIndex(year, 8);
		
	}
	
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public static void selectDropDownValueByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}
	
	/**
	 * 
	 * @param element
	 * @param index
	 */
	public static void selectDropDownValueByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

}
