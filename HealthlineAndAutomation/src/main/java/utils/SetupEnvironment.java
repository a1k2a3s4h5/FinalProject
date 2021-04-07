package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupEnvironment {
	/**
	 * Browser setting path for chrome,firefox and edge
	 */
	public static WebDriver driver;
	public WebDriver driverReturn(String browserName, String url) {
		driver=null;
		
		Logger.print("Starting browser : "+browserName );
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3	, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		else {
			System.out.println("Invalid browser name");
		}
		return driver;
	}
}
