package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_009_NameConcept {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		
		Thread.sleep(3000);
		
		//First usage
//		WebElement userElement = driver.findElement(By.name("username"));
//		userElement.sendKeys("ilhan@gmail.com");
		
		//Second 
		//driver.findElement(By.name("username")).sendKeys("ilhan@gmail.com");
		
		//Third usage
		By username = By.name("username");
//		WebElement userElement = driver.findElement(username);
//		userElement.sendKeys("Biximgenclik@gmail.com");
		
		//Fourth Usage
		ElementUtil.getElement(driver, username).sendKeys("LastPart@gmail.com");
		

	}

}
