package com.assignmentflipkart.pages;

import org.hamcrest.Matchers;
import org.openqa.selenium.interactions.Actions;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class AddtocartTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "addtocrt.btn.addtocartpage")
	private QAFWebElement addtocrtBtnAddtocartpage;
	@FindBy(locator = "remove.btn.addtocart")
	private QAFWebElement removeBtnAddtocart;
	@FindBy(locator = "productname.lbl.addtocartpage")
	private QAFWebElement productnameLblAddtocartpage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getAddtocrtBtnAddtocartpage() {
		return addtocrtBtnAddtocartpage;
	}

	public QAFWebElement getRemoveBtnAddtocart() {
		return removeBtnAddtocart;
	}

	public void clickonaddtocart() {
		Actions actions=new Actions(driver);
		getAddtocrtBtnAddtocartpage().waitForVisible();
	    actions.moveToElement(getAddtocrtBtnAddtocartpage()).click().build().perform();
		//getAddtocrtBtnAddtocartpage().click();
	}

	public void verifyproductadded() {

		Validator.verifyThat("product added to cart", getProductnameLblAddtocartpage().isDisplayed(), Matchers.equalTo(true));
		
	}

	public QAFWebElement getProductnameLblAddtocartpage() {
		return productnameLblAddtocartpage;
	}
}
