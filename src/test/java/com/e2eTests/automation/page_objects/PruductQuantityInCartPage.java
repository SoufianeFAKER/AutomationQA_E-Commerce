package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class PruductQuantityInCartPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'View Product')])[3]")
	private static WebElement btnViewProduct;
	
	@FindBy(how = How.ID, using = "quantity")
	private static WebElement fieldQuantity;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add to cart']")
	private static WebElement btnAddToCart;
	
	@FindBy(how = How.XPATH, using = "//u[normalize-space()='View Cart']")
	private static WebElement btnViewCart;
	
	@FindBy(how = How.XPATH, using = "//td[@class='cart_quantity']")
	private static WebElement quantityProduct;
	
	public SeleniumUtils seleniumUtils;

	public PruductQuantityInCartPage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public void clickOnBtnViewProduct() {
		
		seleniumUtils.click(btnViewProduct);
		
	}
	
	public String getPageTitle() {
		
		 return seleniumUtils.getTitle();
	}
	
	public void fillFieldQuantity(String quantity) {
		
		seleniumUtils.writeText(fieldQuantity, quantity);
		
	}
	
	public void clickOnAddToCartButton() {
		
		seleniumUtils.click(btnAddToCart);
		
	}
	
	public void clickOnViewCartButton() {
		
		seleniumUtils.click(btnViewCart);
		
	}
	
	public String getQuantityOfProduct() {
		
		return quantityProduct.getText();
		
	}

}
