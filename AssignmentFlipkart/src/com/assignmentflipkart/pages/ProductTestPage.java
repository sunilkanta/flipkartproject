package com.assignmentflipkart.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.assignmentflipkart.commonutills.Utills;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "pricelwtohigh.lnk.productpage")
	private QAFWebElement pricelwtohighLnkProductpage;

	@FindBy(locator = "price.lst.productpage")
	private List<WebElement> priceLstProductpage;

	@FindBy(locator = "pricehightolow.lnk.productpage")
	private QAFWebElement pricehightolowLnkProductpage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getPricelwtohighLnkProductpage() {
		return pricelwtohighLnkProductpage;
	}

	public List<WebElement> getPriceLstProductpage() {
		return priceLstProductpage;
	}

	public void clickonlowestprice() {

		getPricelwtohighLnkProductpage().click();
		getPriceLstProductpage().get(0).click();
		Utills utills = new Utills();
		utills.switchToWindow("switchtohildwindow");

	}

	public QAFWebElement getPricehightolowLnkProductpage() {
		return pricehightolowLnkProductpage;
	}

}
