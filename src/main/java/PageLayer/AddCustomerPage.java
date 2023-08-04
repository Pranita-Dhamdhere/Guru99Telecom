package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;


public class AddCustomerPage extends BaseClass {
			
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustlink;
	
	
	public AddCustomerPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnAddcustLink()
	{
		UtilsClass.click(addCustlink);
	}
	
			public String captureUrl()
			
			{
				return UtilsClass.getUrl();
			}
			

			public String captureTitle()
			
			{
				return UtilsClass.getTitle();
			}	
			
			
			
			
			
			
}
