package com.e2eTests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Wait;

public class AddReviewPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//li[@class='active']/a")
	private static WebElement reviewText;

	@FindBy(how = How.ID, using = "name")
	private static WebElement fieldName;

	@FindBy(how = How.ID, using = "email")
	private static WebElement fieldEmail;

	@FindBy(how = How.ID, using = "review")
	private static WebElement fieldReview;

	@FindBy(how = How.ID, using = "button-review")
	private static WebElement btnSubmit;
	
	@FindBy(how = How.XPATH, using = "//form[@id='review-form']/child::div")
	private static WebElement successMessage;

	public SeleniumUtils seleniumUtils;
	public Wait wait;

	public AddReviewPage() {

		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		wait = new Wait(Setup.getDriver());

	}

	public String getReviewText() {
		
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("window.scrollBy(0, 400);");

		return seleniumUtils.readText(reviewText);

	}

	public void enterName(String nameText) {
		
		seleniumUtils.writeText(fieldName, nameText);

	}

	public void enterEmail(String emailText) {

		seleniumUtils.writeText(fieldEmail, emailText);

	}
	
	public void enterReviewMessage(String reviewText) {

		seleniumUtils.writeText(fieldReview, reviewText);

	}
	
	public void clikOnBtnSubmit() {
		
		seleniumUtils.click(btnSubmit);
		
	}
	
	public String getsuccessMessage() {
		
		WebElement success = wait.waitUntilToBeVisible(Setup.getDriver(), successMessage);
		return seleniumUtils.readText(success);
		
	}

}
