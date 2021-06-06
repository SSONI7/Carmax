package Carmax.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Carmax.util.BrowserFactory;
import Carmax.util.CommonMethods;
import Carmax.util.WebDriverEventListeners;

public class CommonClass {

	
	public static WebDriver driver;
	public EventFiringWebDriver dr;
	public WebDriverEventListeners eventListener;
	
	

	BrowserFactory Obj1 = new BrowserFactory();

	public void HelperClass(){
	}
	 
	@BeforeSuite
	public void beforeSuite(){
	 
	}
	 
	@BeforeClass
	public void beforeClass(){
    System.out.println("in @BeforeClass");
	
				
	}
	 
	@BeforeMethod
	public void beforeMethodClass(){
	System.out.println("in @BeforeMethod");
	driver = Obj1.getDriver("chrome");
	//driver = BrowserFactory.getDriver("chrome");
	dr = new EventFiringWebDriver(driver);
	eventListener = new WebDriverEventListeners();
	dr.register(eventListener);
	
	
	}
	 @BeforeTest
	 public void event(){
	
	 }
	 
	@AfterMethod
	public void close()
	{
	//this.driver.close();
	}
	 
	@AfterClass
	public void afterClass(){
	 
	}
	 
	@AfterSuite
	public void afterSuite() throws IOException{
	 
	driver.quit();
	}
	}
 
