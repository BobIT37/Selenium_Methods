package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_002_WebDriverBasicswithFF {

	public static void main(String[] args) {
		
		//Set property
		System.setProperty("webdriver.gecko.driver", "/Users/bobit/Documents/Drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Validation -- verify
		if(title.equals("YouTube")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		
		driver.close();
		//driver.quit();
		System.out.println("Test completed");

	}

}
