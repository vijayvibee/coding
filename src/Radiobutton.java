import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Radiobutton {
WebDriver driver;
	
	@BeforeClass
	          public void testsetup() {
		      System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		      driver=new ChromeDriver();
	   driver.manage().window().maximize();
	}  @BeforeMethod
              public void OpenBrowser() {
		      driver.get("https://demo.guru99.com/test/radio.html");
    }
    @Test(description="Checkbox")
           public void choose() {
    	   driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));
    }
    @Test(description="checkbox2")
            public void choose2() {
    	    driver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]"));
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
