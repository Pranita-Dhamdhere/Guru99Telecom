package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.AddCustomerPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
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
	public void user_validatae_url_and_title() throws InterruptedException {
		addcust=new AddCustomerPage();
		Assert.assertEquals(addcust.captureUrl().contains("telecom"),true);
		Assert.assertEquals(addcust.captureTitle(),"Guru99 Telecom");
		Thread.sleep(5000);
	}
	

	@Then("user click on Add Customer link")
	public void user_click_on_add_customer_link() throws InterruptedException {
	    
			addcust.clickOnAddcustLink();
			Thread.sleep(5000);
}
	@After
	public static void tearDown(Scenario scenario) 
	{
		if(scenario.isFailed())
		{
			byte[] f=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());
		}
		else
		{
			byte[] f=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());
		}
	}
	}
