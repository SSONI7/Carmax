package Carmax.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	WebDriver driver;

//	public CommonMethods(WebDriver driver) {
//		
//		//this.driver = driver;
//		PageFactory.initElements(driver, this);
//		 	
//	}
	
	public void click(WebElement element) {
		try {
			
			element.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void sendKeys(WebElement element, String keys) {
		try {
			
			element.clear();
			element.sendKeys(keys);

		
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
	} 
	
	public void waitAndSendkeys(WebElement element, String keys, int i) {
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, i);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.sendKeys(keys);
	
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void waitAndClick(WebElement element, int time) {
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}


	
	
	
}
