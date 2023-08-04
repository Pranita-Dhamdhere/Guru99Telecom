package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class AddTariffPlanPage extends BaseClass 
{
	@FindBy (xpath="(//a[text()='Home'])[1]")
	private WebElement homePageButton;
	
	@FindBy (xpath="//a[text()='Add Tariff Plan']")
	private WebElement addTariffPlan;
	
	@FindBy (name="rental")
	private WebElement monthlyRental;
	
	@FindBy (name="local_minutes")
	private WebElement freeLocalMin;
	
	@FindBy (name="inter_minutes")
	private WebElement freeInternationalMin;
	
	@FindBy (name="sms_pack")
	private WebElement freeSMS;
	
	@FindBy (name="minutes_charges")
	private WebElement localPerMinCharge;
	
	@FindBy (name="inter_charges")
	private WebElement internationalPerMinCharge;
	
	@FindBy (name="sms_charges")
	private WebElement smsPerCharge;
	
	@FindBy (name="submit")
	private WebElement submitButton;
	
	public AddTariffPlanPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHomePageButton()
	{
		UtilsClass.click(homePageButton);
	}
	
	public void clickOnAddTariffPlanButton()
	{
		UtilsClass.click(addTariffPlan);
	}
	
	public void enterFreeData(String MonthlyRental, String FreeLocalMin, String FreeInternationalMin, 
			String FreeSMS)
	{
		UtilsClass.sendKeys(monthlyRental, MonthlyRental);
		UtilsClass.sendKeys(freeLocalMin, FreeLocalMin);
		UtilsClass.sendKeys(freeInternationalMin, FreeInternationalMin);
		UtilsClass.sendKeys(freeSMS, FreeSMS);
	}
	
	public void enterCharges(String LocalPerMinCharge, String InternationalPerMinCharge,
			String SMSPerCharge)
	{
		UtilsClass.sendKeys(localPerMinCharge, LocalPerMinCharge);
		UtilsClass.sendKeys(internationalPerMinCharge, InternationalPerMinCharge);
		UtilsClass.sendKeys(smsPerCharge, SMSPerCharge);
	}
	
	public void clickOnButton()
	{
		UtilsClass.click(submitButton);
	}
	
}
