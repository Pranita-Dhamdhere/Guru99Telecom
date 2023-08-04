package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.AddCustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomerPageDef extends BaseClass {
	public static AddCustomerPage addcust;

	@Given("user on home page")
	public void user_on_home_page() {
		
		initialization();
		
		
	}

	@When("user validatae url and title")
	public void user_validatae_url_and_title() {
		addcust=new AddCustomerPage();
		Assert.assertEquals(addcust.captureUrl().contains("telecom"),true);
		Assert.assertEquals(addcust.captureTitle(),"Guru99 Telecom");
	}

	@Then("user click on Add Customer link")
	public void user_click_on_add_customer_link() {
	    
			addcust.clickOnAddcustLink();
}
	}
