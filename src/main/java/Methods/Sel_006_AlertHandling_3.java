package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_006_AlertHandling_3 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		By goBtn = By.name("proceed");
		
		//Launch browser
		driver = ElementUtil.launchBrowser(driver, "chrome");
		//navigate url
		ElementUtil.launchURL(driver, url);
		//get title
		System.out.println(ElementUtil.getPageTitle(driver));
		//click method
		ElementUtil.clickOn(driver, goBtn);
		
		Thread.sleep(4000);
		
		String text = ElementUtil.getAlertText(driver);
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct title");
		}else {
			System.out.println("in-correct title");
		}
		
		ElementUtil.quitBrowser(driver);

	}

}
