package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_011_Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Xpath: it is used to find location of element on the web page using HTML structure.	
		//Absolute (/) Relative (//)
		//  //tagname[@attributeName= 'value']
		///html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[2]/input[1]
		//Relative -- 
		//  form-control private-form__control login-password m-bottom-3
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000); // 5 seconds
			
//		WebElement userElement = driver.findElement(By.xpath("//input[@id='username']"));
//		userElement.sendKeys("ilhan@gmail.com");
	//	
//		WebElement passElement = driver.findElement(By.xpath("//input[@id='password']"));
//		passElement.sendKeys("1r3");
	//	
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		loginBtn.click();
	//	
//		driver.quit();
		
		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		
		ElementUtil.getElement(driver, username).sendKeys("ilhan@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("543hsgsfcs");
		
		}

}
