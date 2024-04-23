package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class VerifyAllProductsPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//a[@href='/products']")
	private static WebElement btnProducts;
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='All Products']")
	private static WebElement allProductsMessage;
	
	@FindBy(how = How.XPATH, using = "//div[@class='features_items']")
	private static WebElement productListBox;
	
	@FindBy(how = How.XPATH, using = "//div//div//div//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	private static WebElement btnViewProduct;
	
	@FindBy(how = How.CSS, using = "div[class='product-information'] h2")
	private static WebElement productNameBox;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Category: Women > Tops']")
	private static WebElement categoryBox;
	
	@FindBy(how = How.CSS, using = "div[class='product-information'] span span")
	private static WebElement priceBox;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Availability:']")
	private static WebElement availabilityBox;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Condition:']")
	private static WebElement conditionBox;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Brand:']")
	private static WebElement brandBox;
	
	public SeleniumUtils seleniumUtils;
	
	public VerifyAllProductsPage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}
	
	public void	clickOnBtnProducts() {
		
		seleniumUtils.click(btnProducts);
		
	}
	
	public String getAllProductsMessage() {
		
		return seleniumUtils.readText(allProductsMessage);
		
	}
	
	public Boolean getProductListState() {
		
		return productListBox.isDisplayed();
		
	}
	
	public void clickOnBtnViewProduct() {
		
		seleniumUtils.click(btnViewProduct);
		
	}
	
	public String getProductDetailPageURL() {
		
		return Setup.getDriver().getCurrentUrl();
		
	}
	
	public Boolean getProductNameStatus() {
		
		return productNameBox.isDisplayed();
	}
	
	public Boolean getCategoryStatus() {
		
		return categoryBox.isDisplayed();
		
	}
	
	public Boolean getPriceStatus() {
		
		return priceBox.isDisplayed();
		
	}
	
	public Boolean getAvailabilityStatus() {
		
		return availabilityBox.isDisplayed();
		
	}
	
	public Boolean getConditionStatus() {
		
		return conditionBox.isDisplayed();
		
	}
	
	public Boolean getBrandStatus() {
		
		return brandBox.isDisplayed();
		
	}

}
