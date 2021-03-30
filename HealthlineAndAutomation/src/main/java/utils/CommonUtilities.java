package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonUtilities {

	// Browser setting path
	public void browserSetup() {

		String chromePath = "./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
	}

	//returns driver object with chrome and opens website 
	public WebDriver driverReturn() {
		String url = "http://automationpractice.com/index.php";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	/**
	 * login verification with email and passowrd.
	 * @param email
	 * @param password
	 */
	public void login(String email, String password) {
		String url = "http://automationpractice.com/index.php";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Locators loc = new Locators();
		WebElement signUp = driver.findElement(By.className(loc.signUpClassName));
		signUp.click();

		WebElement loginEmail = driver.findElement(By.id(loc.loginEmailId));
		loginEmail.sendKeys(email);

		WebElement loginPassword = driver.findElement(By.id(loc.loginPasswordId));
		loginPassword.sendKeys(password);

		WebElement signin = driver.findElement(By.id(loc.signinId));
		signin.click();

		driver.quit();

	}
}
