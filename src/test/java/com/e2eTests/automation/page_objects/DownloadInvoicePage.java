package com.e2eTests.automation.page_objects;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class DownloadInvoicePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Download Invoice')]")
	private static WebElement btnDownloadInvoice;

	public SeleniumUtils seleniumUtils;

	public static String pathFile = "C:\\Users\\soufi\\OneDrive\\Bureau\\invoice.txt";

	public DownloadInvoicePage() {

		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();

	}

	public void clickOnBtnDownloadInvoice() {

		seleniumUtils.click(btnDownloadInvoice);

		seleniumUtils.fileDownload(pathFile);

	}

	public boolean checkDownloadingFile() {

		File f = new File(pathFile);
		if (f.exists()) {

			return true;

		} else {

			return false;

		}
	}

}
