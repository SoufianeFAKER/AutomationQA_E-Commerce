package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class SubscriptionCartPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Cart']")
	private static WebElement btnCart;
	
	public SeleniumUtils seleniumUtils;

	public SubscriptionCartPage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public void clickOnBtnCart() {
		
		seleniumUtils.click(btnCart);
		
	}


}
