package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_004_AlertHandling_1 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().browserVersion("81.0.4044.138").setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(false);
        driver = new ChromeDriver(chromeOptions);
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Locator
		driver.findElement(By.name("proceed")).click();
	
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct text: "+ text);
		}else {
			System.out.println("incorrect text "+ text);
		}
		
		alert.accept();
		
		driver.close();
		System.out.println("Test completed");

	}

}
