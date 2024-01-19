package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css="#nav-link-accountList-nav-line-1")
	WebElement signin;
	
	@FindBy(id="ap_email")
	WebElement txt_username;
	

	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement submit_btn;
	
	
	public void setsignin() {
		
			signin.click();;
		}
	public void setusername(String user) {
		
		txt_username.sendKeys(user);;
	}
	
    public void continuebtn() {
		
	continue_.click();;
	}	
	public void setPassword(String pwd) {
			
	txt_password.sendKeys(pwd);
	}
		
	public void clickSubmit() {
		
			submit_btn.submit();
		}

}