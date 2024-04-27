package com.e2eTests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class SubscriptionHomePage extends BasePage {
	
	@FindBy(how = How.ID, using = "footer")
	private static WebElement footerSection;
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Subscription']")
	private static WebElement subScriptionMessage;
	
	@FindBy(how = How.ID, using = "susbscribe_email")
	private static WebElement fieldEmail;
	
	@FindBy(how = How.ID, using = "subscribe")
	private static WebElement btnSubmit;
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert-success alert']")
	private static WebElement successMessage;
	
	public SeleniumUtils seleniumUtils;

	public SubscriptionHomePage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public void scrollToTheFooterSection() {
		
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("arguments[0].scrollIntoView();", footerSection);
		
	}
	
	public String getSubScriptionMessage() {
		
		return seleniumUtils.readText(subScriptionMessage);
		
	}
	
	public void enterEmailAddress(String emailText) {
		
		seleniumUtils.writeText(fieldEmail, emailText);
		
	}
	
	public void clickOnBtnSubmit() {
		
		seleniumUtils.click(btnSubmit);
		
	}
	
	public String getSuccessSubMessage() {
		
		return seleniumUtils.readText(successMessage);
		
	}

}
