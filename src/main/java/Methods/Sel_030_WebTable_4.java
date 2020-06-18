package Methods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_030_WebTable_4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowCount = getTableCount(driver);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		
		//table[@id='customers']//tr
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpathCompany = "]/td[1]";
		String afterXpathContact = "]/td[2]";
		String afterXpathCountry = "]/td[3]";
		
		getColumnData(driver, beforeXpath, afterXpathCompany);
		getColumnData(driver, beforeXpath, afterXpathContact);
		getColumnData(driver, beforeXpath, afterXpathCountry);
	
	}
	
	public static int getTableCount(WebDriver driver){
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCount = rowList.size();
		//System.out.println(rowCount);
		return rowCount;
	}
	
	public static ArrayList<String> getColumnData(WebDriver driver, String beforeXpath, String afterXpath){
		ArrayList<String> data = new ArrayList<String>();
		for(int rowNum = 2; rowNum <= getTableCount(driver); rowNum++){
			String actualXPath = beforeXpath + rowNum + afterXpath;
			//System.out.println(actualXPath);
			String text = driver.findElement(By.xpath(actualXPath)).getText();
			System.out.println(text);
			data.add(text);
		}
		return data;
 
	}

}
