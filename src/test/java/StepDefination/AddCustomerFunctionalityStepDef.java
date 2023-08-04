package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.AddCustomerFunctionalityPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomerFunctionalityStepDef extends BaseClass {
	public static AddCustomerFunctionalityPage customer;
	

	@When("User Select Background Radio button")
	public void user_select_background_radio_button() {
		customer=new AddCustomerFunctionalityPage();
		customer.selectRadioButton("ACTIVE");
		
	   
	}

	@When("User enter Firstname and Lastname and Email and Address and Mobilenumber")
	public void user_enter_firstname_and_lastname_and_email_and_address_and_mobilenumber() {
		customer.addcustFuctionality("Sulbha", "Date", "sulbha@gmail.com", "Shirur", "2345678987");
	}

	@When("User click on Submit button")
	public void user_click_on_submit_button() {
		customer.clickonSubmit();
	}

	@Then("User capture the customer ID")
	public void user_capture_the_customer_id() {
		customer.captureCustID();
	}

}
