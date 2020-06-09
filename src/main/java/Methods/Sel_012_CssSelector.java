package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_012_CssSelector {

  public static void main(String[] args) throws InterruptedException {
		
		//CSS 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000); // 5 seconds
		
		By username = By.cssSelector("#username");
		ElementUtil.getElement(driver, username).sendKeys("ziya@gmail.com");
		By passowrd = By.cssSelector("#password");
		ElementUtil.getElement(driver, passowrd).sendKeys("123test");
		By loginBtn = By.cssSelector("#loginBtn");
		ElementUtil.getElement(driver, loginBtn).click();
		

	}

}
