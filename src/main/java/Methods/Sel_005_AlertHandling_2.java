package Methods;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_005_AlertHandling_2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
    WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	//Locator
	driver.findElement(By.name("proceed")).click();

	Thread.sleep(4000);
	
	//getAlertText();
	
	if(ElementUtil.getAlertText(driver).equals("Please enter a valid user name")) {
		System.out.println("correct text");
	}else {
		System.out.println("incorrect text");
	}
	
	driver.quit();
	

	}
	
//	public static String getAlertText() {
//		Alert alert  = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
//		return text;
//	}

}
