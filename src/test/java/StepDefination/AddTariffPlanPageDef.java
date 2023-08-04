package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.AddTariffPlanPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTariffPlanPageDef extends BaseClass
{
	public static AddTariffPlanPage addtariffplan;
	@When("user click on Home Link")
	public void user_click_on_home_link()
	{
		addtariffplan= new AddTariffPlanPage();
		addtariffplan.clickOnHomePageButton();
		
	}
	
	@Then("user click on Add Tariff Plan Link")
	public void user_click_on_add_tariff_plan_link() throws InterruptedException  
	{
		Thread.sleep(5000);
		addtariffplan.clickOnAddTariffPlanButton();
	}
	
	@Then("user enter Monthly Rental and Free Local minutes and Free International minutes and Free SMS pack")
	public void user_enter_monthly_rental_and_free_local_minutes_and_free_international_minutes_and_free_sms_pack()
	{
		addtariffplan.enterFreeData("500", "100", "50", "100");
	}
	
	@Then("user enter Local per minute charge and International per minute charge and SMS per charge")
	public void user_enter_local_per_minute_charge_and_international_per_minute_charge_and_sms_per_charge() throws InterruptedException 
	{
		addtariffplan.enterCharges("1", "10", "1");
		Thread.sleep(5000);
	}
	
	@Then("click on submit button")
	public void click_on_submit_button() 
	{
		addtariffplan.clickOnButton();
	}
}
