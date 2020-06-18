package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_025_MultipleDropdown_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectSingleValue(driver, "choice 3");

	}
	
	/**
	 * Single selection
	 * @param driver
	 * @param value
	 */
	public static void selectSingleValue(WebDriver driver, String value) {
		
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		//System.out.println(dropList.size());
		
		for(int i= 0; i<dropList.size(); i++) {
			String text = dropList.get(i).getText();
			//System.out.println(text);
			
			try {
				if(!text.isEmpty()) {  //use not equal to select any value
					if(text.equals(value)) {
						dropList.get(i).click();
						break;
					}
				}
			} catch (Exception e) {
				

			}
		}
	}

}
