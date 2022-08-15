package com.testNG;

import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
	//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJava\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");

	}
	
	public void googleTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	public void googlelogoTest() {
		WebElement b = driver.findElement(By.xpath("//*[@id='hplogo']"));
	}
	

}
