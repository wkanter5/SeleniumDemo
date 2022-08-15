package xPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search'] ")).sendKeys("T-shirt");
		driver.findElement(By.xpath("//button[contains(@name,'search')]")).click();

		//driver.findElement(By.xpath("//button[@name='submit_search'] ")).click();
		
		
		//String str="sdfvsdf68fsdfsf8999fsdf09";
		// String numberOnly= str.replaceAll("[^0-9]", "");
		WebElement price = driver.findElement(By.xpath("(//span[@class='price'])[1]"));
		String pr = price.getText();
		String numOnly = pr.replaceAll("[$]","");
		double price1 = Double.parseDouble(numOnly);
		System.out.println("price is: "+price1);
		
		//'and' =operator
		//driver.findElement(By.xpath("//div[@id='header_logo' and //header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]]")).click();
		driver.close();
		
		//xpath with contains() function syntax: //tagname[contains(@attribute,'value')]		
		//driver.findElement(By.xpath("//button[contains(@name,'search')]")).click();
		
		//xpath with text() function syntax: //tagname[text()='value']
		
		//chained Xpatth:inside the parent there are some sub-elements, instead of directly searching 
		//sub-elements we go from parent element to sub-element
		//form[@id='searchbox']//input[4]
		////form[@id='searchbox']//input[@class='search_query form-control ac_input'] 
		
		
	}
}
