package com.e2eTests.automation.page_objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class AddressDetailsPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//ul[@id='address_delivery']")
	private static WebElement deliveryAddress;

	@FindBy(how = How.ID, using = "address_invoice")
	private static WebElement billingAddress;

	SeleniumUtils seleniumUtils;

	public AddressDetailsPage() {

		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();

	}

	public List<String> getDelivryAddress() {

		List<WebElement> elements = deliveryAddress.findElements(By.tagName("li"));

		List<String> myAddress = new ArrayList<>();

		for (WebElement e : elements) {

			myAddress.add(e.getText());

		}

		myAddress.remove(0);

		return myAddress;

	}

	public List<String> getBillingAddress() {

		List<WebElement> elements = billingAddress.findElements(By.tagName("li"));

		List<String> myAddress = new ArrayList<>();

		for (WebElement e : elements) {

			myAddress.add(e.getText());

		}

		myAddress.remove(0);

		return myAddress;

	}

}
