package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_003_WebDriverManager {

	public static void main(String[] args) {
		
		//Set property
		//System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
		
		WebDriverManager.chromedriver().browserVersion("81.0.4044.138").setup();
		
		WebDriver driver = new ChromeDriver();
		
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
		driver.quit();
		System.out.println("Test completed");

	}

}
