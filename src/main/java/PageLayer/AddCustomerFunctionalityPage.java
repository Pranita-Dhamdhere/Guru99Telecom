package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class AddCustomerFunctionalityPage extends BaseClass {
	static String Cid;

	@FindBy(xpath = "//input[@name='active']")
	private List<WebElement> radio;

	@FindBy(name = "fname")
	private WebElement fname;

	@FindBy(name = "lname")
	private WebElement lname;

	@FindBy(name = "emailid")
	private WebElement emailid;

	@FindBy(name = "addr")
	private WebElement addr;

	@FindBy(name = "telephoneno")
	private WebElement telephoneno;

	@FindBy(name = "submit")
	private WebElement submit;

	@FindBy(xpath = "//table[@class='alt access']//td[2]")
	private WebElement custID;

	public AddCustomerFunctionalityPage() {
		PageFactory.initElements(driver, this);

	}

	public void selectRadioButton(String Radio) {
		UtilsClass.handleRadio(radio, Radio);
	}

	public void addcustFuctionality(String Fname, String Lname, String Email, String Address, String phone) {
		UtilsClass.sendKeys(fname, Fname);
		UtilsClass.sendKeys(lname, Lname);
		UtilsClass.sendKeys(emailid, Email);
		UtilsClass.sendKeys(addr, Address);
		UtilsClass.sendKeys(telephoneno, phone);
	}

	public String captureCustID() {
		String  Cid = custID.getText();
		System.out.println(Cid);
		return Cid;
		

	}

	public void clickonSubmit() {

		UtilsClass.click(submit);
	}

}
