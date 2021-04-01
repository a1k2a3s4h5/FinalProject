package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ScreenShotListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult result) {
		SetupEnvironment setup=new SetupEnvironment();
		WebDriver driver = setup.driverReturn("chrome","");
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodName = result.getName();
		if (!result.isSuccess()) {
			try {
				File scrFile = ((TakesScreenshot) (driver))
						.getScreenshotAs(OutputType.FILE);
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
						+ "/target/surefire-reports/html";
				String time = formater.format(calendar.getTime());
				File destFile = new File(
						(String) reportDirectory + "/failure_screenshots/" + methodName + "_" + time + ".png");
				FileUtils.copyFile(scrFile, destFile);
				Reporter.log("<br>----------Screenshot---------<br>");
				String path = "<img src=\"./failure_screenshots/" + methodName + "_" + time + ".png"
						+ "\" height=\"600\" width=\"800\">";
				System.setProperty("org.uncommons.reportng.escape-output", "false");
				Reporter.log(path);

			} catch (IOException e) {
				e.printStackTrace();
			} catch (WebDriverException we) {
				we.printStackTrace();
			}
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}