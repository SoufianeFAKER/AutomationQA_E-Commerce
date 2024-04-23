package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class VerifyTCPagePage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Test Cases')]")
	private static WebElement btnTestCases;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Test Cases']")
	private static WebElement testCasesMessage;
	
	public SeleniumUtils seleniumUtils;

	public VerifyTCPagePage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public void clickOnBtnTestCases() {
		
		seleniumUtils.click(btnTestCases);
		
	}
	
	public String getTestCasesMessage() {
		
		return seleniumUtils.readText(testCasesMessage);
		
	}

}
