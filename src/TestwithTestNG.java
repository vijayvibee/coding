import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestwithTestNG {
	WebDriver driver;
	
	@BeforeClass
	          public void testsetup() {
		      System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		      driver=new ChromeDriver();
		      driver.manage().window().maximize();
		
	}
	@BeforeMethod
	          public void openBrowser() {
		      driver.get("https://www.flipkart.com/");
	}
	@Test(description="login purpose")
	          public void signup() {
		      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8870420242");
		      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	}  
	@AfterMethod
	          public void postsignup() {
		      System.out.println(driver.getCurrentUrl());
	}
	@AfterClass
	          public void afetrclass() {
		      driver.quit();
	}
	      

}
