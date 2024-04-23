package com.e2eTests.automation.page_objects;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;


public class SearchProductPage extends BasePage {
	
	@FindBy(how = How.ID, using = "search_product")
	private static WebElement fieldSearchProduct;
	
	@FindBy(how = How.ID, using = "submit_search")
	private static WebElement btnSearchProduct;
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Searched Products']")
	private static WebElement searchProductMessage;
	
	@FindBy(how = How.XPATH, using = "//div[@class='features_items']")
	private static WebElement parentElement;
	
	
	
	public SeleniumUtils seleniumUtils;

	public SearchProductPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public void enterTextInFieldSearchProduct(String serchProductText) {
		
		seleniumUtils.writeText(fieldSearchProduct, serchProductText);
		
	}
	
	public void clickOnBtnSearchProduct() {
		
		seleniumUtils.click(btnSearchProduct);
		
	}
	
	public String getSearchedProductsMessage() {
		
		return seleniumUtils.readText(searchProductMessage);
		
	}
	
	public void getElementsOfParent() {
		

		List<WebElement> listItems = parentElement.findElements(By.className("product-image-wrapper"));
		

	    int cpt = 0;
	    String subElementText = "shirt";
	    		
		for (WebElement listItem : listItems) {
		    
		    String elementText = listItem.getText();
		   
		    if(elementText.toLowerCase().contains(subElementText.toLowerCase()) && listItem.isDisplayed()) {
		    	cpt = cpt + 1;
		    }
		    
		}
		
		int sizeList = listItems.size();
		
		Assert.assertEquals(cpt, sizeList);
		
	}

}
