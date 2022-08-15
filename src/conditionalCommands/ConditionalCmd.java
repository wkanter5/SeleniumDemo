package conditionalCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCmd {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.xpath("//form[@id='small-search-box-form']"));
		System.out.println(searchBox.isDisplayed());
		System.out.println(searchBox.isEnabled());
		
		
		WebElement male_rd= driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(".............");
		System.out.println("male: "+male_rd.isSelected());
		System.out.println("female: "+female_rd.isSelected());
		
		System.out.println(".............");
		female_rd.click();
		male_rd.click();
		System.out.println("male: "+male_rd.isSelected());
		System.out.println("female: "+female_rd.isSelected());

		
		System.out.println(".............");
		male_rd.click();
		female_rd.click();
		System.out.println("male: "+male_rd.isSelected());
		System.out.println("female: "+female_rd.isSelected());
		
		//form[@id='small-search-box-form']
		driver.quit();
		
	}
}
