package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class PO_RegisterWhileCheckoutPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Proceed To Checkout']")
	private static WebElement btnProceedToCheckOut;

	@FindBy(how = How.XPATH, using = "//u[normalize-space()='Register / Login']")
	private static WebElement btnRegisterLogin;

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Address Details']")
	private static WebElement adressDetails;

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Review Your Order']")
	private static WebElement reviewYourOrder;

	@FindBy(how = How.XPATH, using = "//textarea[@name='message']")
	private static WebElement textBox;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Place Order']")
	private static WebElement btnPlaceOrder;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='name-on-card']")
	private static WebElement fieldNameOnCard;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='card-number']")
	private static WebElement fieldCardNumber;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='cvc']")
	private static WebElement fieldCvc;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='expiry-month']")
	private static WebElement fieldExpirationMonth;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='expiry-year']")
	private static WebElement fieldExpirationYear;

	@FindBy(how = How.XPATH, using = "//button[@data-qa='pay-button']")
	private static WebElement btnPayAndConfirmOrder;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
	private static WebElement mesBox;

	SeleniumUtils seleniumUtils;
	// Wait wait;

	public PO_RegisterWhileCheckoutPage() {

		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		// wait = new Wait(Setup.getDriver());

	}

	public String getCurrentUrlCartPage() {

		return Setup.getDriver().getCurrentUrl();

	}

	public void clickOnBtnProceedToCheckOut() {

		seleniumUtils.click(btnProceedToCheckOut);

	}

	public void clickOnBtnRegisterLogin() {

		seleniumUtils.click(btnRegisterLogin);

	}

	public String getAddressDetailsMessage() {

		return adressDetails.getText();

	}

	public String getReviewYourOrderMessage() {

		return reviewYourOrder.getText();

	}

	public void enterMessageInTextField(String message) {

		seleniumUtils.writeText(textBox, message);

	}

	public void clickOnBtnPlaceOrder() {

		seleniumUtils.click(btnPlaceOrder);

	}

	public void enterNameOnCard(String name) {

		seleniumUtils.writeText(fieldNameOnCard, name);

	}

	public void enterCardNumber(String cardNumber) {

		seleniumUtils.writeText(fieldCardNumber, cardNumber);

	}

	public void enterCvc(String cvc) {

		seleniumUtils.writeText(fieldCvc, cvc);

	}

	public void enterExpirationMonth(String expirationMonth) {

		seleniumUtils.writeText(fieldExpirationMonth, expirationMonth);

	}

	public void enterExpirationYear(String expirationYear) {

		seleniumUtils.writeText(fieldExpirationYear, expirationYear);

	}

	public void clickOnBtnPayAndConfirmOrder() {

		seleniumUtils.click(btnPayAndConfirmOrder);

	}

	public String getSuccessMessage() {

		return seleniumUtils.readText(mesBox);

	}

}
