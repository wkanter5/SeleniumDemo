package NavigationalCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().to("https://store.google.com/?hl=en-US");
		
		driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		
		//browser commands
		//driver.close(); : used for closing the single browser window and 
		//closes the whichever window was open first
		//driver.quit(); : Used for closing the multiple browsers window
		
		//if you want to close specific browser window based on your choice 
		//let's say i want to close 2nd and 4th 
		//Ans: by using getWindowHandles(); we can capture the IDs of the windows 
		//based on that id we can capture the titles of the windows and using the titles we 
		//can close the specific window titles
		
		
	}

}
