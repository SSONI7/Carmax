package Carmax.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

import Carmax.testcase.CommonClass;

public class WebDriverEventListeners extends BrowserFactory implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		Reporter.log("Alert is present"+driver.switchTo().alert().getText());
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		Reporter.log("Alert is accepted");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		Reporter.log("Alert is dismissed");
		
    }

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		Reporter.log("Naviagte to the url "+url);
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		Reporter.log("Naviagted to the url "+url);
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		Reporter.log("Finding the element" +driver.findElement(by));
		Reporter.log(by.toString());
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		Reporter.log("Found the element" +driver.findElement(by));
		Reporter.log(by.toString());
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		Reporter.log("Clicking on element "+element.getText());
		Reporter.log(element.toString());
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		Reporter.log("Clicked on element "+element.getText());
		Reporter.log(element.toString());
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
