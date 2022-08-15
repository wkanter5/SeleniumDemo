package waitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Declaration
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5)) //every 5 seconds it hits the web element is if it is available on the web page
			       .ignoring(NoSuchElementException.class);// no need to write any exception, it handles such exception
		 
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		
		//
		//Uses 
		WebElement webLink = wait.until(new Function<WebDriver, WebElement>() { public
			  WebElement apply(WebDriver driver) { return driver.findElement(By.id("//h3[text()='Selenium']"));
			  } });
		webLink.click();
	}

}
