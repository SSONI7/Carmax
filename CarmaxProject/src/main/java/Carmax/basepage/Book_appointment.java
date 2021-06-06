package Carmax.basepage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Carmax.util.PropertiesFiles;

public class Book_appointment {

	WebDriver driver;
	Properties testdata = PropertiesFiles.readPropertiesFiles();


		  public Book_appointment(WebDriver driver){ 
		
	       this.driver = driver;
		   PageFactory.initElements(driver, this);
		  
		  }
		  
		
		@FindBy(xpath = "//img[contains(@alt,'White 2017 Ford Fusion Hybrid with stock number: 20283579')]")
		WebElement ford_fusion_2017;
		
		@FindBy(xpath = "//body/main[@id='main']/div[7]/div[5]/div[2]/div[2]/div[2]/ul[1]/li[3]")
		WebElement hold_at_cool_springs;
		
		@FindBy(xpath = "//a[contains(text(),'Continue')]")
		WebElement continue_button;
		
		@FindBy(xpath = "//button[contains(text(),'Continue')]")
		WebElement appointment_continue;
		
		@FindBy(xpath = "//input[@id='react-datepicker']")
		WebElement date_picker;
		
		@FindBy(xpath = "//div[@class='react-datepicker__month'][contains(.,'3031123456789101112131415161718192021222324252627282930123')]")
		WebElement complete_calander;
		
		@FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--012 react-datepicker__day--weekend'][contains(.,'12')]")
		WebElement date;
		
		@FindBy(xpath = "//div[@class='kmx-timepicker'][contains(.,'Time')]")
		WebElement time;
		
		@FindBy(xpath = "//input[contains(@name,'phoneNumber')]")
		WebElement phonenumber;
		
		@FindBy(xpath = "//li[@class='react-datepicker__time-list-item '][contains(.,'10:30 PM')]")
		WebElement time_1030;
		
		@FindBy(xpath = "//button[@tabindex='0'][contains(.,'Submit')]")
		WebElement submit_appointment;
		
		public void datepicker() {
			
			
//			 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//			 Calendar cal = Calendar.getInstance();
//			 cal.setTime(new Date());
//			 int day = cal.get(Calendar.DAY_OF_MONTH);
//			 cal.add(Calendar.DAY_OF_MONTH, 5);
//			 String newDate = dateFormat.format(cal.getTime());
//			 System.out.println(newDate);
//			 String str1 = Integer.toString(day);
//			 System.out.println(day);
			 
			 
		}
	   
		public void select_2017_car() throws InterruptedException {
			
			
			 
			String times = testdata.getProperty("time");
			String phone_num = testdata.getProperty("phone");
			
			ford_fusion_2017.click();
			Thread.sleep(8000);
			hold_at_cool_springs.click();
			continue_button.click();
			Thread.sleep(3000);
			appointment_continue.click();
			date_picker.click();
			Thread.sleep(5000);
			date.click();
			Thread.sleep(2000);
			//Select se = new Select(time);
			//se.selectByVisibleText("10:30 PM");
			time.click();
			time_1030.click();
			//time.sendKeys(times);
			WaitFor10();
			phonenumber.sendKeys(phone_num);
			WaitFor10();
			submit_appointment.click();
			Thread.sleep(5000);
			
		}
		
		public void WaitFor10() {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Wait for 10 seconds");

		}

	
}
