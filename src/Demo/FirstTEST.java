package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;

public class FirstTEST {
	WebDriver driver;
	
	@BeforeClass
	public void Startup() throws Exception{
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driver\\chromedriver_win32\\chromedriver.exe");
 	   driver= new ChromeDriver();
	}
	@AfterClass
	public void teardown() {
	driver.close();
	}
	@Test
	public void TC001()throws Exception{
		driver.navigate().to("https://sakshingp.github.io/assignment/login.html");
	Reporter.log("Application open");
	Thread.sleep(3000);
	driver.findElement(By.id("username")).sendKeys("maithili");
	Reporter.log("Enter UserName pass");
	driver.findElement(By.id("password")).sendKeys("989023");
	Reporter.log("Enter password pass");
	Thread.sleep(3000);
   driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[1]/label/input")).click();
   Reporter.log("Click check box pass");
	List<WebElement>links=driver.findElements(By.tagName("a"));
	for(WebElement val:links) {
		System.out.println(val.getText());
		}
	Thread.sleep(3000);
	driver.findElement(By.id("log-in")).click();
	Reporter.log("Login sucefully pass ");
	
	Thread.sleep(3000);
      //driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div/div/table/thead/tr/th[5]")).click();
      //Reporter.log("Enter view statement pass ");
	driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]/div[3]/a/span")).click();
	Reporter.log("Amount sort pass");
	Thread.sleep(3000);
	
	}
}