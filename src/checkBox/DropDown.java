package checkBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait: 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		//Handle dropdown: we need the help of select Class
		//we have to store the drop down element to a variable after we pass that variable 
		//we have pass inside the select class object, we import the select class. we instantiate the object of select class
		//and pass the variable that is select element. we have 3 methods available on select class
		
		WebElement drpCountryEle =driver.findElement(By.xpath("//select[@name='country_id']"));
		Select drpCountry = new Select(drpCountryEle);
		//select by visible text
		//drpCountry.selectByVisibleText("Bhutan");// pass the country name 
		
		//drpCountry.selectByValue("223"); // select by value
		
		//select by index
		//drpCountry.selectByIndex(2);
		
		// 2) Find total num. of countrues 
		List<WebElement> allOptions =drpCountry.getOptions();
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size();i++) {
			
			if(i>50) {
			System.out.println(allOptions.get(i).getText());
			}
		}
		/*
		 * for(WebElement names:allOptions) {
		 * System.out.println("Names of country is : "+names.getText()); }
		 */
						
	}

}
