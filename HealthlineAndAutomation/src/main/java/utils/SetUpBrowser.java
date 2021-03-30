package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetUpBrowser {
	public static WebDriver openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			return(new EdgeDriver());
		}
		else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			return(new ChromeDriver());
		}
		return null;
	 }
}
