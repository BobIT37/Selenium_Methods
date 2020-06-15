package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_022_DropDownOptions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
		
		//Writing all values
        
        Select select = new Select(day);
        
        List<WebElement> dayOptions = select.getOptions();
        System.out.println(dayOptions.size());
        
        for(int i = 0; i<dayOptions.size(); i++) {
        	String text = dayOptions.get(i).getText();
        	System.out.println(text);
        	
        	
        	
        }
		

	}

}
