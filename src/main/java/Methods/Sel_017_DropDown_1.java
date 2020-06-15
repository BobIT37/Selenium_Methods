package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_017_DropDown_1 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().browserVersion("80.0.3987.16").setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(false);
        driver = new ChromeDriver(chromeOptions);
        
        driver.get("https://www.facebook.com");
        
        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        
        Select select1 = new Select(day);
        select1.selectByIndex(13);
        //select1.selectByVisibleText("13");
        select1.selectByValue("13");
        Select select2 = new Select(month);
        select2.selectByVisibleText("Mar");
        Select select3 = new Select(year);
        select3.selectByVisibleText("2018");

	}

}
