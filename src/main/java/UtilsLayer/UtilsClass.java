package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void sendKeys(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}

	public static void click(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}

	public static String getUrl() {
		return driver.getCurrentUrl();
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static void handleRadio(List<WebElement> wb, String value)

	{
		for (WebElement a : wb) {
			if (a.getText().equals(value)) {
				a.click();
				break;

			}
		}

	}

}
