package waitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCmd {

	public static void main(String[] args) throws InterruptedException {  
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//implicit wait: it elements takes more than 10 seconds there is performance issue.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//implicit wait is applicable for all driver object, only one is enough because it is associated with driver. it works bases on time
		//we do not need to write multiple times 
		
		//Explicit wait: we have to declare  and use it, it works based on condition()
		// we put certain condition on element, wait for some until the element is visible, we use try catch block for uses
		//Disadvantages: For multiple uses we have to write multiple times so it is complex and specific to one element 
		//
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(5)); // explicit wait declaration 
		
		//Wherever the sync issues occurs, it take care of that and time is not wasted 
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		
		//Explicit wait uses
		try {
		WebElement webEle=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
		webEle.click();
		} catch(Exception e) {
			System.out.println("Element not found");
		}
		//
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		
		//Thread.sleep(5000);
		//Disadvantages: we have to insert multiple thread.sleep() 
		//it will wait for the maximum timeout hence, it causes slow and poor performance 
		//if the element takes more time, still there is chance of getting the Exception so, 
		//it is not recommended to use in project
		
		//
		
		//synchronization issue: sometimes the execution or automation script is faster than the 
		//Web page application response slow Internet, or many people accessing same application 
		//response or some elements are not loading is noSuchElementException, pageNotLoadedException
		//in those scenarios we sometimes we face synchronization issue
		//so we use wait statements 
		
		//these waits are available on java not Selenium 
		//fluent wait is only available on java
		//Implicit wait, explicit wait, fluent wait
		
		
	}

}
