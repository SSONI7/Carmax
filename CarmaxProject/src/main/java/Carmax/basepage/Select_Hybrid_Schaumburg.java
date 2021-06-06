package Carmax.basepage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Carmax.util.CommonMethods;
import Carmax.util.PropertiesFiles;
import Carmax.util.Random_Email;

public class Select_Hybrid_Schaumburg{

	WebDriver driver;
	Properties testdata = PropertiesFiles.readPropertiesFiles();


		  public Select_Hybrid_Schaumburg(WebDriver driver){ 
		
	       this.driver = driver;
		   PageFactory.initElements(driver, this);
		  
		  }
		  
		  
		@FindBy(xpath = "//button[@id='header-my-store-button']")
		WebElement your_nearest_store;
		
		@FindBy(xpath = "//input[@id='header-store-search']")
		WebElement search_by_zip;
		
		@FindBy(xpath = "//button[@id='header-store-search-button']")
		WebElement search_by_zip_button;
		
		@FindBy(xpath = "//button[@id='setUserStore-7128']")
		WebElement schaumburg_store;
		
		@FindBy(xpath = "//header/nav[1]/section[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
		WebElement view_store_details;
		
		@FindBy(xpath = "//body/main[@id='main']/div[@id='content']/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/button[2]/*[1]")
		WebElement car_models;
		
		@FindBy(xpath = "//span[contains(text(),'Hybrids')]")
		WebElement hybrid_car;
		
		@FindBy(xpath = "//button[@id='set-your-store']")
		WebElement set_your_store;
		
	
		public void select_hybrid_car() throws InterruptedException {
			
			String zip = testdata.getProperty("zipcode");
				
			your_nearest_store.click();
			search_by_zip.sendKeys(zip);
			search_by_zip_button.click();
			WaitFor10();
			schaumburg_store.click();
			Thread.sleep(8000);
			car_models.click();
			WaitFor10();
			set_your_store.click();
			WaitFor10();
			hybrid_car.click();
			Thread.sleep(5000);
		}
		
		public void WaitFor10() {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Wait for 10 seconds");

		}

}
