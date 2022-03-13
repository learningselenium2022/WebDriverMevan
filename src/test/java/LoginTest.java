

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	//public static WebDriverManager manager;
	@BeforeSuite
	public void setUp() {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.name("identifier")).sendKeys("smita@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}
