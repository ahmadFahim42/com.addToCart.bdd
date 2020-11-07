package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddToCartPageObj extends Base {
	
	public AddToCartPageObj() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how =How.XPATH, using ="//a[contains(text(),'Tablets')]")
	private WebElement tablet;
	
	
	@FindBy(how =How.XPATH, using ="//span[contains(text(),'Add to Cart')]")
	private WebElement addToCart;
	
	
	
	@FindBy(how =How.XPATH, using =" //span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	
	
	
	
	
	public void clickOntablet() {
		tablet.click();
		
	}
	
	public void clickOnaddToCart() {
		addToCart.click();
	}
	
	public void clickOnShopping() {
		shoppingCart.click();
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	

}
