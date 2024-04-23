package com.e2eTests.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class ContactUsFormPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Get In Touch']")
	private static WebElement getInTouchMessage;
	
	@FindBy(how = How.XPATH, using = "//input[@data-qa='name']")
	private static WebElement fieldContactName;
	
	@FindBy(how = How.XPATH, using = "//input[@data-qa='email']")
	private static WebElement fieldContactEmail;
	
	@FindBy(how = How.XPATH, using = "//input[@data-qa='subject']")
	private static WebElement fieldContactSubject;
	
	@FindBy(how = How.XPATH, using = "//textarea[@data-qa='message']")
	private static WebElement fieldContactMessage;
	
	@FindBy(how = How.XPATH, using = "//input[@name='upload_file']")
	private static WebElement btnUploadFile;
	
	@FindBy(how = How.XPATH, using = "//input[@data-qa='submit-button']")
	private static WebElement btnContactSubmit;
	
	@FindBy(how = How.XPATH, using = "//div[@class='status alert alert-success']")
	private static WebElement successMessage;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Home']")
	private static WebElement btnContactHome;
	
	SeleniumUtils seleniumUtils;

	public ContactUsFormPage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public String getMessageGetTouch() {
		
		return seleniumUtils.readText(getInTouchMessage);
		
	}
	
	public void enterContactName(String nameText) {
		
		seleniumUtils.writeText(fieldContactName, nameText);
		
	}
	
	public void enterContactEmail(String emailText) {
		
		seleniumUtils.writeText(fieldContactEmail, emailText);
		
	}
	
	public void enterContactSubject(String subjectText) {
		
		seleniumUtils.writeText(fieldContactSubject, subjectText);
		
	}
	
	public void enterContactMessage(String messageText) {
		
		seleniumUtils.writeText(fieldContactMessage, messageText);
		
	}
	
	public void uploadContactFile() {
		
		String path= System.getProperty("user.dir") +"\\src\\test\\resources\\configs\\DataTest.xlsx";
		btnUploadFile.sendKeys(path);
		
	}
	
	public void clickOnBtnContactSubmit() {
		
		seleniumUtils.click(btnContactSubmit);
		
	}
	
	public String getSuccessMessage() {
		
		return seleniumUtils.readText(successMessage);
		
	}
	
	public void clickOnBtnContactHome() {
		
		seleniumUtils.click(btnContactHome);
		
	}

}
