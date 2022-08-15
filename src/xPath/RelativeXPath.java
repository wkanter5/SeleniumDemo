package xPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		if(	driver.findElement(By.xpath("//input[@value='Get a Free Trial'][@onclick='buttonClick()']")).isEnabled()){

		System.out.println("Button is clickable");
		driver.findElement(By.xpath("//input[@value='Get a Free Trial'][@onclick='buttonClick()']")).click();
		if (driver.getCurrentUrl().contains("https://www.orangehrm.com/orangehrm-30-day-al/?")) {
			System.out.println("Url of the page is: "+driver.getCurrentUrl());

		}
		else {
			System.out.println("Page not available");
			}
		}
		else {
			driver.close();
			}

		
		//driver.quit();
	}

}
