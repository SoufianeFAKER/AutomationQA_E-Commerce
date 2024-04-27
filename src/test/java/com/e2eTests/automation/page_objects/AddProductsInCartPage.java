package com.e2eTests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class AddProductsInCartPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//body/section/div/div/div/div/div[2]/div[1]/div[1]/div[1]")
	private static WebElement productBox_1;
	
	@FindBy(how = How.XPATH, using = "//div//div//div//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")
	private static WebElement btnAddToCart;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue Shopping']")
	private static WebElement btnContinueShopping;

	public SeleniumUtils seleniumUtils;

	public AddProductsInCartPage() {

		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();

	}
	
	public void hoverOverFirstPruduct() {
		
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("window.scrollBy(0, 400);", productBox_1);
		
		Actions action = new Actions(Setup.getDriver());
		action.moveToElement(productBox_1).build().perform();
		
	}
	
	public void clickOnBtnAddToCart() {
		
		seleniumUtils.click(btnAddToCart);
		
//		Actions action = new Actions(Setup.getDriver());
//		action.click(btnAddToCart).build().perform();
		
	}
	
	public void clickOnBtnContinueShopping() {
		
		seleniumUtils.click(btnContinueShopping);
		System.out.println("******");
		
//		Actions action = new Actions(Setup.getDriver());
//		action.click(btnContinueShopping).build().perform();
		
	}

}
