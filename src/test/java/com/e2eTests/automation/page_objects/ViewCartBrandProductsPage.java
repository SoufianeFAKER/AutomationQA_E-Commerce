package com.e2eTests.automation.page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class ViewCartBrandProductsPage extends BasePage {
	

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Brands']")
	private static WebElement brandsPanel;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/brand_products/Polo']")
	private static WebElement btnPolo;
	
	@FindBy(how = How.CSS, using = ".title.text-center")
	private static WebElement brandTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='features_items']")
	private static WebElement productsBox;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/brand_products/Biba']")
	private static WebElement btnBiba;
	
	public SeleniumUtils seleniumUtils;

	public ViewCartBrandProductsPage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public String getbrandsPanelTitle() {
		
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("window.scrollBy(0, 500)");
		
		return seleniumUtils.readText(brandsPanel);
		
	}
	
	public void clickOnBtnPolo() {
		
		seleniumUtils.click(btnPolo);
		
	}
	
	public String getCurrentURL() {
		
		return brandTitle.getText();
		
	}
	
	public boolean verifyProductsIsDisplayed() {
		
		List<WebElement> elements = productsBox.findElements(By.className("single-products"));
		
		if (elements.size() != 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	public void clickOnBtnBiba() {
		
		seleniumUtils.click(btnBiba);
		
	}

}
