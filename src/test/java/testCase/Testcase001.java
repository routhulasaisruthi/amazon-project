package testCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class Testcase001 extends Baseclass{
	@Test(priority=0)
	public void loginfunctionality() throws IOException {
		
		Loginpage lp=new Loginpage(driver);     // login the application with valid data
		lp.setsignin();
		lp.setusername(rb.getString("username"));
		lp.continuebtn();
		lp.setPassword(rb.getString("password"));
		lp.clickSubmit();
	}
	
		@Test(priority=1)
		public void searchfunctionality() {      //searching the product list page 
			Homepage hp1=new Homepage(driver);
			hp1.drpdown();
			
		}
		
		@Test(priority=2)
		public void searchproduct() {          // searching the earpods product in search bar
			Homepage hp1=new Homepage(driver);
			hp1.searchbar("earpods");
			hp1.submitbtn();
			
			
		}
		@Test(priority=3)
		public void thirdproduct() {            // select the product and add to cart 
			Homepage hp1=new Homepage(driver);
			hp1.selectproduct();
			hp1.addproduct();
		}
		
		
		
}	

		
	