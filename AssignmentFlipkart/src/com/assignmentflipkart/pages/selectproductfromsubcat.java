package com.assignmentflipkart.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class selectproductfromsubcat extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "selectproduct.lnk.productname")
	private QAFWebElement selectproductLnkProductname;


	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getSelectproductLnkProductname() {
		return selectproductLnkProductname;
	}

	public void selectProduct(String productName) {
		QAFExtendedWebElement productCatogoryName = new QAFExtendedWebElement(String
				.format(ConfigurationManager.getBundle().getString("selectproduct.lnk.productname"), productName));
		Validator.givenThat("user verify select a productpage", productCatogoryName.getText().equalsIgnoreCase("iPad"),
				Matchers.equalTo(true));
		productCatogoryName.click();
	}

	
}
