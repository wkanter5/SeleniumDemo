package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	//pre-conditions
	
	/*setup system property for chrome
	 * launch browser
	 * login to app
	 * enter URL
	 * google title test
	 * logout from app
	 * close browser
	 * delete all cookies
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property for chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("lunch chrome browser");
		
	}
	
	@BeforeTest 
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod 
	public void enterURL () {
		System.out.println("enter the URL");
	}
	
	
	//test cases starting with @Test
	@Test 
	public void googleTitleTest () {
		System.out.println("Google title test");
		
	}
		
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}
	//post conditions
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
			
	}

	@AfterClass
	public void deleteAllCookies() {
		System.out.println("delete cookies");
	}
	
	@AfterTest 
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test report");
	}
}
