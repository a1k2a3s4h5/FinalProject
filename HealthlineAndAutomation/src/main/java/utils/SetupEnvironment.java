package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupEnvironment {
	/**
	 * Browser setting path for chrome,firefox and edge
	 * @param browserName
	 * @param url
	 */
	public WebDriver driverReturn(String browserName, String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			
		String chromePath ="./Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			String edgePath = "./drivers/msedgedriver.exe";
			System.setProperty("webdriver.msedge.driver", edgePath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			String edgePath = "./Drivers/msedgedriver.exe";
			System.setProperty("webdriver.msedge.driver", edgePath);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else {
			System.out.println("Invalid browser name");
		}
		return driver;
	}
}
