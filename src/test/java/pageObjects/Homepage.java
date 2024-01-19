package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends Basepage{

	public Homepage(WebDriver driver) {
		super(driver);

	}
	

	@FindBy(css="#searchDropdownBox")
	WebElement search_drpdown;
	
	@FindBy(css="input#twotabsearchtextbox")
	WebElement search_bar;
	
	@FindBy(css="img.s-image[data-image-index='3']")
	WebElement select_prod;
	
	@FindBy(css="button#a-autoid-4-announce")
	WebElement  add_cart;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement submit_btn;
	
	public void drpdown()
	{
	search_drpdown.click();
	Select options=new Select(search_drpdown);
	List <WebElement> prdlist=options.getOptions();
	System.out.println(prdlist.size());
    options.selectByVisibleText("Electronics");
	}
	
	public void searchbar(String items) {
	
		search_bar.sendKeys(items);
	}
	
	public void submitbtn() {
		
		submit_btn.click();
	}

	public void selectproduct() {
		
		select_prod.click();
		
	}
	public void addproduct() {
		
		add_cart.click();
		
	}
}
