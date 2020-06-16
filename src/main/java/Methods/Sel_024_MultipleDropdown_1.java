package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Sel_024_MultipleDropdown_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());
		
		for(int i =0; i<dropList.size(); i++) {
			String text = dropList.get(i).getText();
			System.out.println(text);
			
			//Ignore empty values
			if(!text.isEmpty()) {
				dropList.get(i).click();
			}
			
			if(text.equals("choice 6")) {
				dropList.get(i).click();
				break;
			}
		}
		

	}

}
