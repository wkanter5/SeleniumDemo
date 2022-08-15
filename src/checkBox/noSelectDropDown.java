package checkBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class noSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait: 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		List<WebElement>allOptions=driver.findElements(By.xpath("//select[@name='country_id']//option"));
		for(WebElement options:allOptions) {
			
			System.out.println(options.getText());
			System.out.println();
		}
		
		//selecting option form dropdown
		for(WebElement option: allOptions) {
			if(option.getText().equals("Bhutan")) {
				
				option.click();
			}
		
	}
		
		
		
		
	}

}
