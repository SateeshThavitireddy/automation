package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basicMethods.methods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
public class mainClass {
	WebDriver driver = new ChromeDriver();
	methods method = new methods(driver);
	JavascriptExecutor  javaScript = (JavascriptExecutor) driver;
	String value;
	
	@BeforeTest
	public void startBrowser() {
		
	}
	@Test
	@Parameters({"username","password"})
	public void TestGoogle(String username, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		method.clickElement("Book Store Application");
		method.clickElement("Login");
		method.setValueByID("userName", username);
		method.setValueByID("password", password);
		method.clickButtonById("login");
	}
	@AfterTest
	public void quiteBrowser() {
		driver.quit();
	}
}
