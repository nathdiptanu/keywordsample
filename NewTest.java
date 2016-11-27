package leaderboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@BeforeClass	
	public void Chrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
  public void f() throws InterruptedException {
		/*WebDriverCommonUtils wlib=new WebDriverCommonUtils();

		 
		//////Login///////////////
		wlib.Login(driver);
		wlib.waitForPageToLoad(driver);
		
		wlib.ClickTagChatAdmin("GROUP ASSIGNMENT", driver);
		Thread.sleep(2000);
		WebElement wb1=driver.findElement(By.xpath("//div[@id='groupassignment']/div/div[2]/input"));
		//div[@id="groupassignment"]/div/div[2]/input
		//div[@class='container-1']/input
		Actions act1=new Actions(driver);
		Thread.sleep(5000);
		//act1.moveToElement(wb1).click().build().perform();
		act1.moveToElement(wb1).click().sendKeys("AG!").build().perform();
		
		Thread.sleep(10000);
		*/
	
	}
}
