package getCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Current Url: "+driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.getWindowHandle() creates a unique id for page dynamically, we use those id to switch 
		//between multiple browser windows and tabs to perform further operations 
		String windowId=driver.getWindowHandle();// returns single browser window Id
		System.out.println("Browser window Id:"+windowId);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs=driver.getWindowHandles();
		for(String windIds:windowIDs) {
			System.out.println(windIds);
		}
		
		driver.quit();
		
		//conditional commands returns boolean values(true/false)
		//isDisplayed, isEnabled, isSelected : are used for check boxes, radio buttons, dropdown etc. 
		
	}

}
