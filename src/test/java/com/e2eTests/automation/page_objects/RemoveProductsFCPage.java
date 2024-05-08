package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;


public class RemoveProductsFCPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//*[@data-product-id=1]")
	private static WebElement bntX;
	
	@FindBy(how = How.ID, using = "empty_cart")
	private static WebElement emptyMessage;
	
	public SeleniumUtils seleniumUtils;

	public RemoveProductsFCPage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public void clickOnBtnX() {
		
		seleniumUtils.click(bntX);
		
	}
	
	public String getCartEmptyMessage() {
		
		return seleniumUtils.readText(emptyMessage);
		
	}

}
