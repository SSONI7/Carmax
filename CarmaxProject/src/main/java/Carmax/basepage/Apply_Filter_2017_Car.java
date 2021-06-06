package Carmax.basepage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Carmax.util.PropertiesFiles;

public class Apply_Filter_2017_Car {

	WebDriver driver;
	Properties testdata = PropertiesFiles.readPropertiesFiles();


		  public Apply_Filter_2017_Car(WebDriver driver){ 
		
	       this.driver = driver;
		   PageFactory.initElements(driver, this);
		  
		  }
		  
		  
		@FindBy(xpath = "//h4[contains(text(),'Year')]")
		WebElement select_model_year;
		
		@FindBy(xpath = "//h4[contains(text(),'Distance')]")
		WebElement filter_distance;
		
		@FindBy(xpath = "//select[contains(@class,'mdc-select__native-control')]")
		WebElement select_miles;
		
		@FindBy(xpath = "//body/main[1]/div[1]/div[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
		WebElement filter_distance_back;
		
		@FindBy(xpath = "//select[@id='select-qInlM1QF']")
		WebElement select_year_from;
		
		@FindBy(xpath = "//select[@id='select-i3l_N8PF']")
		WebElement select_year_to;
		
		@FindBy(xpath = "//button[contains(text(),'Apply Changes')]")
		WebElement apply_changes_button;
		
		@FindBy(xpath = "//h4[contains(text(),'Status')]")
		WebElement filter_status;
		
		@FindBy(xpath = "//li[@class='refinement-value panel-menu--anim-target'][contains(.,'Used')]")
		WebElement status_used;
		
		@FindBy(xpath = "//body/main[1]/div[1]/div[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
		WebElement filter_status_back;
		
		@FindBy(xpath = "//input[contains(@value,'8')]")
		WebElement newest_arrivals;
		
		@FindBy(xpath = "//h4[contains(text(),'Sort by')]")
		WebElement  filter_sort_by;
		
		@FindBy(xpath = "//body/main[1]/div[1]/div[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
		WebElement  filter_sort_by_back;
		
		@FindBy(xpath = "//h4[contains(text(),'Year')]")
		WebElement filter_year;
		
		@FindBy(xpath = "//body/main[1]/div[1]/div[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
		WebElement filter_year_back;
		
		
		@FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
		WebElement year_from;
		
		@FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]")
		WebElement year_to;
		
	
		
		
		public void filter() throws InterruptedException {
			
			filter_distance.click();
			Thread.sleep(2000);
			select_miles.sendKeys("500 miles");
			WaitFor10();
			filter_distance_back.click();
			WaitFor10();
			filter_sort_by.click();
			newest_arrivals.click();
			WaitFor10();
			filter_sort_by_back.click();
			WaitFor10();
			filter_year.click();
			Thread.sleep(4000);
			year_from.sendKeys("2010");
			year_to.sendKeys("2020");
			WaitFor10();
			filter_year_back.click();
			WaitFor10();
			filter_status.click();
			status_used.click();
			WaitFor10();
			filter_status_back.click();
			
			Thread.sleep(5000);
		}
		
		public void WaitFor10() {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Wait for 10 seconds");

		}
}
