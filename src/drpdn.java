import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class drpdn {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demoqa.com/select-menu");
	}
	@Test
	public void drp() {
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\\\"oldSelectMenu\\\"]")));
		s.selectByIndex(1);
	}


@AfterClass
public void quitBrowser() {
driver.quit();
}
}