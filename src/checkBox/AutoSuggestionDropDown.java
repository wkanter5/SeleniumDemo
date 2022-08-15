package checkBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait: 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		Thread.sleep(5000);

		List<WebElement>allOptions=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']"));
		System.out.println("Number of options are: "+allOptions.size());

		/*
		 * for(WebElement options:allOptions) {
		 * 
		 * System.out.println(options.getText()); }
		 */
		for(WebElement option:allOptions) {

			if(option.getText().contains("python"));
			{
				option.click();
				break;
			}
		}
	}

}
