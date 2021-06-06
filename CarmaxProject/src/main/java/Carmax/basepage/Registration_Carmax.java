package Carmax.basepage;

import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Carmax.util.PropertiesFiles;
import Carmax.util.Random_Email;

public class Registration_Carmax {

	 WebDriver driver;
	 static String emailID;
		
		Properties testdata = PropertiesFiles.readPropertiesFiles();
		
		Random_Email email_ID = new Random_Email();
		
		  public Registration_Carmax(WebDriver driver){ 
		
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
		
		@FindBy(xpath = "//header/nav[1]/section[2]/div[2]/button[1]/*[1]")
		WebElement profile_icon;
		
		@FindBy(xpath = "//a[contains(text(),'Register')]")
		WebElement profile_register;
		
		@FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
		WebElement first_name;
		
		@FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
		WebElement last_name;
		
		@FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
		WebElement email;
		
		@FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")
		WebElement password;
		
		@FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")
		WebElement retype_password;
		
		@FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/input[2]")
		WebElement register_button;
		
		
		
		public void open() {
			
			String URL = testdata.getProperty("url");
			driver.get(URL);
		}
		
		public void Register_User() throws InterruptedException {
			
			String fname = testdata.getProperty("firstname");
			String lname = testdata.getProperty("lastname");
			String pwd = testdata.getProperty("password");
			String repwd = testdata.getProperty("retype");
			
			
			profile_icon.click();
			profile_register.click();
			Thread.sleep(5000);
			first_name.sendKeys(fname);
			last_name.sendKeys(lname);
			emailID = email_ID.getEmail(); 
			email.sendKeys(emailID+"@gmail.com");
			password.sendKeys(pwd);
			retype_password.sendKeys(repwd);
			register_button.click();
			Thread.sleep(5000);
		}
}
