package poly.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	public String BaseUrl = "https://vnexpress.net/";
	// change your chrome driver path
	String driverPath = "D:\\Document\\Advanced Testing\\TaiNguyen\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	// Launch browser before test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(BaseUrl);
	}

	// Doing test
	@Test
	public void checkTitle() {
		// Compare actual result and expected result
		assertEquals(driver.getTitle(), "VnExpress - Báo tiếng Việt nhiều người xem nhất");
	}

	@AfterTest
	// Close browser after test
	public void closeBrowser() {
		driver.close();
	}

}
