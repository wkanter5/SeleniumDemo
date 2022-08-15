package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSele {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		// search with Tag name and ID with separator #
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("T-shirts");
		
		// search with Tag name and class with separator . dot

		driver.findElement(By.cssSelector("input.search_query ")).sendKeys("T-shirts");
		
		//search with tag and attribute with []
		driver.findElement(By.cssSelector("[name=\'submit_search\'] ")).click();
		
		
	}

}
