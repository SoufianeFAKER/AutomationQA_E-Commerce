package com.e2eTests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class RecommendedItemsPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//div[@class='recommended_items']/h2")
	private static WebElement itemsTitle;

	@FindBy(how = How.XPATH, using = "//div[@id='recommended-item-carousel']//div/a[@class='btn btn-default add-to-cart']")
	private static WebElement btnAddToCart;

	@FindBy(how = How.XPATH, using = "//*[@id='cart_info']//tbody/tr")
	private static WebElement product;

	SeleniumUtils seleniumUtils;

	public RecommendedItemsPage() {

		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}

	public void scrollToBottomOfPage() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", itemsTitle);

	}

	public String getRecommendedItemsTitle() {

		return seleniumUtils.readText(itemsTitle);

	}

	public void clickOnAddToCartButton() {

		seleniumUtils.click(btnAddToCart);

	}

	public boolean presenceOfProductInCart() {

		return product.isDisplayed();

	}

}
