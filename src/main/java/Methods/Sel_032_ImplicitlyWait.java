package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_032_ImplicitlyWait {

	public static void main(String[] args) {
		
		//This wait tells webdriver to wait if the element is not available immidiatelly
		//and webdriver waits till the element is visible in specific time
		//NoSuchElementException
		//Imp wwait can be used only webelement
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		
		System.out.println("title is :"+ driver.getTitle());

	}

}
