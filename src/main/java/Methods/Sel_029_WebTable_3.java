package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sel_029_WebTable_3 {

	public static void main(String[] args) {
		
		//Handle web table columns
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String colBeforeXpath = "//*[@id='customers']/tbody/tr[1]/th[";
		String colAfterXpath = "]";
		
		List<WebElement> coList = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int colCount = coList.size();
		System.out.println(colCount);
		
		System.out.println("columns value are: ");
		for(int i = 1; i<=colCount; i++) {
			WebElement element = driver.findElement(By.xpath(colBeforeXpath+i+colAfterXpath));
			String colText = element.getText();
			
			System.out.println(colText);
		}
	}
	
	

}
