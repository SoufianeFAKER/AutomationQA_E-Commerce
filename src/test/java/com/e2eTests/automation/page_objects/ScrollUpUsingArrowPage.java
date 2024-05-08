package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class ScrollUpUsingArrowPage extends BasePage {

	@FindBy(how = How.ID, using = "scrollUp")
	private static WebElement btnScrollUp;
	
	@FindBy(how = How.XPATH, using = "//div[@class='logo pull-left']")
	private static WebElement logoWebSite;
	
	@FindBy(how = How.XPATH, using = "//div[@class='carousel-inner']//h2")
	private static WebElement carouselText;
	
	public SeleniumUtils seleniumUtils;

	public ScrollUpUsingArrowPage() {

		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}
	
	public void clickOnBtnScrollUp() {
		
		seleniumUtils.click(btnScrollUp);
		
	}
	
	public boolean logoWebSiteIsVisible() {
		
		return logoWebSite.isDisplayed();
		
	}
	
	public String carouselTextIsVisible() {
		
		return seleniumUtils.readText(carouselText);
		
	}

}
