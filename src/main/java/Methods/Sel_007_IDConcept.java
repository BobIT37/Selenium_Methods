package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_007_IDConcept {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//ID
		
		//First Usage
		WebElement userElement = driver.findElement(By.id("username"));
		userElement.sendKeys("boblerry@gmail.com");
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys("test@123");
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		loginBtn.click();
		
		//Second usage
		//driver.findElement(By.id("username")).sendKeys("ilhan@gmail.com");
		
		//Third Usage
		//By username = By.id("username");
		//WebElement userElement = driver.findElement(username);
		//userElement.sendKeys("robert@gmail.com");
		
		//Fouth Approach
		//ElementUtil.getElement(driver, username).sendKeys("ilhan@gmail.com");

	}

}
