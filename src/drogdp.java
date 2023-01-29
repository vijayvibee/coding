import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class drogdp {
	WebDriver dr;
	@BeforeClass
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://demo.guru99.com/test/drag_drop.html");
	
}
	@Test()
	 public void source() {
		Actions a=new Actions(dr);
		WebElement source=dr.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement des=dr.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		a.clickAndHold(source).moveToElement(des).release(des).perform();
}
	@AfterClass
	public void quitBrowser() {
	dr.quit();
	}
	}