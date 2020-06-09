package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_010_LinkConcept {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000); // 5 seconds
		
		By signUp = By.linkText("Sign up");
		//By signUp = By.partialLinkText("Privacy");
		ElementUtil.getElement(driver, signUp).click();
		ElementUtil.getElement(driver, signUp).click();

	}


}
