package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_016_BackwardAndForward {
	
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver"); //key: driver == value: driver's path
	
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		
		//Navigation
		//navigate
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(2000); //2 seconds MS
		driver.navigate().back();   //google
		Thread.sleep(2000);
		driver.navigate().forward(); //amazon
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.quit();
		
		//Interview question
		
		// get & navigate
		
		// get navigates to a webpage. Webdriver will wait until the page has fully loaded before
		// returning control script. Get function does not have any method
		// navigate function navigates to a webpage. Webdriver will not wait  the page has fully loaded
		// back - forward - refresh
		
		
		//Select two different webpages
		//FirefoxDriver()
		

	}

}
