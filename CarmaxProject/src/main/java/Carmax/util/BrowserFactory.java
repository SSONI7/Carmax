package Carmax.util;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Carmax.testcase.CommonClass;
	 
	public class BrowserFactory{
		
		WebDriver driver;

 
	public WebDriver getDriver(String browserName){
		
	if(driver==null){
	if(browserName.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver", "");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	}else if(browserName.equalsIgnoreCase("chrome")){
	System.out.println("in chrome");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saniket\\git\\Carmax\\CarmaxProject\\lib\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	}else if(browserName.equalsIgnoreCase("IE")){
	System.setProperty("webdriver.ie.driver", "");
	driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();


	}
	}
	return driver;
	}
	}

