package Carmax.testcase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Carmax.basepage.Apply_Filter_2017_Car;
import Carmax.basepage.Book_appointment;
import Carmax.basepage.Registration_Carmax;
import Carmax.basepage.Select_Hybrid_Schaumburg;

@Listeners({ Carmax.util.ScreenshotUtility.class })
public class T02_Nearest_Store extends CommonClass {
	
 @Test
 public void Nearest_store_filter() throws InterruptedException{
	
	  Select_Hybrid_Schaumburg store = new Select_Hybrid_Schaumburg(driver); 
	  Registration_Carmax carmax = new Registration_Carmax(driver);
	  Apply_Filter_2017_Car filter = new Apply_Filter_2017_Car(driver);
	  Book_appointment book = new Book_appointment(driver);

	  carmax.open();
	  carmax.Register_User();
	  store.select_hybrid_car();
	  filter.filter();
	  Thread.sleep(2000);
	  book.select_2017_car();
	  Thread.sleep(5000);
	  
	  }
 }

	  




