package com.e2eTests.automation.page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class SearchProductsCartPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//div[@class='features_items']") 
	private static WebElement productsBox;
	
	@FindBy(how = How.XPATH, using = "//button[@data-dismiss]") 
	private static WebElement btnContinueShopping;
	
	@FindBy(how = How.ID, using = "cart_info") 
	private static WebElement cartInfo;
	
	
	public SeleniumUtils seleniumUtils;

	public SearchProductsCartPage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public void addAllProductsToCart() {
		
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("window.scrollBy(0, 400);");
		
		List<WebElement> elements = productsBox.findElements(By.className("product-image-wrapper"));
		
		Actions action = new Actions(Setup.getDriver());
		int cptElement = 1;
		
		for(WebElement e : elements) {
			
			action.moveToElement(e).perform();
			seleniumUtils.click(e.findElement(By.className("add-to-cart")));
			seleniumUtils.click(btnContinueShopping);
			
			cptElement +=1;
			if (cptElement == 4 ) {
				
				js.executeScript("window.scrollBy(0, 600);");
				
			}
			
		}
		
	}
	
	public boolean presenceOfProductsInCart() {
		
		List<WebElement> elements = cartInfo.findElements(By.tagName("tr"));
		
		int status = 0;
		
		for(WebElement e : elements) {
			
			if (e.isDisplayed()) {
				
				status += 1;
				
			}
		}
		
		if (status != 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}

}
