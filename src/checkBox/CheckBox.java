package checkBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait: 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();

		//Monday check box
		//driver.findElement(By.xpath("//input[@id='monday']")).click();

		//select all check boxes
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox' and@class='form-check-input']"));
		System.out.println("Number of Check boxes: "+checkBoxes.size());
		for(int i=0;i<checkBoxes.size();i++) { 
			checkBoxes.get(i).click(); 
		}

		//  for(WebElement chkbx:checkBoxes) { chkbx.click(); }

		//select last 2 check boxes 
		//Formula: total boxes - num. of boxes i want to select from the last 
		// what ever value i get, that should be the starting index

		/*
		 * for(int i=5;i<checkBoxes.size();i++){ checkBoxes.get(i).click(); }
		 * 
		 * //select first two check boxes
		 * 
		 * for(int i=0;i<2;i++) { checkBoxes.get(i).click(); }
		 */

		//another way of doing it
		/*
		 * for(int i=0;i<checkBoxes.size();i++) { if(i<2) checkBoxes.get(i).click(); }
		 */
		/*
		 * for(int i=0;i<checkBoxes.size();i++) {
		 * 
		 * if(checkBoxes.get(i).isSelected()) checkBoxes.get(i).click(); }
		 * 
		 */
		Thread.sleep(5000);
		for(WebElement chk:checkBoxes) {
			if(chk.isSelected()) {
				chk.click();
			}
		}
		
	}
}
