package Demo;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class loging {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driver\\chromedriver_win32\\chromedriver.exe");	
WebDriver  driver = new ChromeDriver();
driver.get("https://sakshingp.github.io/assignment/login.html");
driver.findElement(By.id("username")).sendKeys("maithili");
driver.findElement(By.id("password")).sendKeys("989023");
driver.findElement(By.xpath("//table//tr/th[5]")).click();
List<WebElement> tData  = driver .findElements(By.xpath("//table//tr//td[5]"));
for (WebElement s : tData ) {
     String text  = s. getText();
     System.out.println(text);

	}

	}
}
