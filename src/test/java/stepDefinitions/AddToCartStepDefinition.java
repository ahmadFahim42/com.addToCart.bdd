package stepDefinitions;



import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.AddToCartPageObj;
import utilities.WebDriverUtility;

public class AddToCartStepDefinition extends Base {
	
	AddToCartPageObj addToCartPageObj = new AddToCartPageObj();
	
	@Given("^User is on retail website$")
	public void user_is_on_retail_website() throws Throwable {
		Base.initializeDriver();
		logger.info("Retail page is opened");
	String actualpageTitle =	addToCartPageObj.getPageTitle();
	String expectedPageTitle = "TEK SCHOOL";
	Assert.assertEquals(expectedPageTitle, actualpageTitle);
	logger.info("page title is verified");
    WebDriverUtility.screenShot();

	}

	@When("^User click on Tablet button$")
	public void user_click_on_Tablet_button() throws Throwable {
			addToCartPageObj.clickOntablet();
			WebDriverUtility.screenShot();
			logger.info("user click on tablet");
			
	    
	}

	@When("^User click on Add to Cart button$")
	public void user_click_on_Add_to_Cart_button() throws Throwable {
		addToCartPageObj.clickOnaddToCart();
		WebDriverUtility.screenShot();
		logger.info("user click on Add to cart button");
		
		
	    
	}

	@When("^User click on Shopping Cart button$")
	public void user_click_on_Shopping_Cart_button() throws Throwable {
		addToCartPageObj.clickOnShopping();
		WebDriverUtility.screenShot();
		logger.info("user click on shopping cart");
		
	   
	}

	@Then("^User should see the item in the shopping cart$")
	public void user_should_see_the_item_in_the_shopping_cart() throws Throwable {
		WebDriverUtility.screenShot();
		logger.info("user is on shopping cart");
	    
	}

	
	
	

}
