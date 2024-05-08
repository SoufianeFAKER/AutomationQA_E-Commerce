package com.e2eTests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class ViewCategoryProductPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Category']")
	private static WebElement categoryPanel;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Women']")
	private static WebElement categoryWomen;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Tops']")
	private static WebElement subCategoryTops;

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Women - Tops Products']")
	private static WebElement categoryTitle;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Men']")
	private static WebElement categoryMen;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Jeans']")
	private static WebElement subCategoryJeans;

	public SeleniumUtils seleniumUtils;

	public ViewCategoryProductPage() {

		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();

	}

	public String getCategoryPanel() {

		return seleniumUtils.readText(categoryPanel);

	}

	public void clickOnCategoryWomen() {
		
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("window.scrollBy(0, 400)");

		seleniumUtils.click(categoryWomen);

	}

	public void clickOnSubCategoryTops() {

		seleniumUtils.click(subCategoryTops);

	}

	public String getCurrentUrl() {

		return Setup.getDriver().getCurrentUrl();

	}

	public String getCategoryTitle() {

		return seleniumUtils.readText(categoryTitle);

	}

	public void clickOnCategoryMen() {

		seleniumUtils.click(categoryMen);

	}
	
	public void clickOnSubCategoryJeans() {
		
		seleniumUtils.click(subCategoryJeans);
		
	}

}
