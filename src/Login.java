import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Login {

	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();//Launch Browser
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com");
	}
	@Test()
	public void enterEmail() {
	WebElement email = driver.findElement(By.id("email"));//By ID
	email.sendKeys("abc@gmail.com");
	}
	@Test()
	
	public void enterPwd() {
	WebElement pass=driver.findElement(By.name("pass")); //By Name
	pass.sendKeys("Test@123");
	}
	@Test()
	public void login() {
	driver.findElement(By.name("login")).click();
	}
	@AfterClass
	public void quitBrowser() {
	driver.quit();
	}
	}
