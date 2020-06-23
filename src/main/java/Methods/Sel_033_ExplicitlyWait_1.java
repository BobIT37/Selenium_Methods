package Methods;

import java.lang.reflect.WildcardType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_033_ExplicitlyWait_1 {

	public static void main(String[] args) {
		
		//It works with webelement and non-webelement
		//It waits available in webdriverwait class
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		
		//non-webelement
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot "));
		
		//Webelement
		By email = By.id("username");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		WebElement username = driver.findElement(email);
		username.sendKeys("ilhan@sample.com");
		//System.out.println(username);
		
		
		System.out.println("title is: "+ driver.getTitle());

	}

}
