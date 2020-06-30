package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_043_JavaScriptExecuterExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//https://darksky.net/
		//https://app.hubspot.com/login
		
		//driver.get("https://app.hubspot.com/login");
		driver.get("https://darksky.net/");
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		
		//get title with JSE
		String title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		//Click element with JSE
		//WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
		//JavaScriptUtil.clickElementByJS(signUpLink, driver);
		
		//Refresh browser
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		//Generate alert 
		//JavaScriptUtil.generateAlert(driver, "This is sign up page");
		
		//Draw border
		//JavaScriptUtil.drawBorder(signUpLink, driver);
		
		//send keys with JSE
		//WebElement username = driver.findElement(By.id("username"));
		//JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "ilhan@gmail.com");
		//JavaScriptUtil.drawBorder(username, driver);
		
		//flash method with JSE
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		
//		JavaScriptUtil.flash(email, driver);
//		email.sendKeys("bob@gmail.com");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("test12345");
//		JavaScriptUtil.flash(loginBtn, driver);
//		loginBtn.click();
		
		//Page Inner
		//System.out.println(JavaScriptUtil.getPageInnerText(driver));
		
		//Get browser info
		System.out.println(JavaScriptUtil.getBrowserInfo(driver));
		
		//Scroll down
		//JavaScriptUtil.scrollPageDown(driver);
		
		//Specific scroll
		//JavaScriptUtil.specificScrollPageDown(driver);
		
		WebElement privacy = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
		
		//It will scroll until it finds the element
		JavaScriptUtil.scrollIntoView(privacy, driver);
		JavaScriptUtil.clickElementByJS(privacy, driver);
		
		
		
		
		

	}

}
