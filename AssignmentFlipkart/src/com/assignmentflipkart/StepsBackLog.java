/**
 * 
 */
package com.assignmentflipkart;

import org.openqa.selenium.interactions.Actions;

import com.assignmentflipkart.pages.AddtocartTestPage;
import com.assignmentflipkart.pages.Homepageflipkart;
import com.assignmentflipkart.pages.ProductTestPage;
import com.assignmentflipkart.pages.selectproductfromsubcat;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;

/**
 * @author sunilkanta.das
 *
 */
public class StepsBackLog {
	Homepageflipkart homepageflipkart = new Homepageflipkart();
	AddtocartTestPage addtocartTestPage = new AddtocartTestPage();
	ProductTestPage productTestPage = new ProductTestPage();

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user open flipkart website")
	public void userOpenFlipkartWebsite() {

		homepageflipkart.lanchflipkartsite();

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user verify homepage")
	public void userVerifyHomepage() {
		homepageflipkart.verifyHomepage();

	}

	@QAFTestStep(description = "user selects {0} from {1} section")
	public void selectproduct(String subcat, String catagory) {

		homepageflipkart.selectCatogory(subcat, catagory);
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user verify the page and click on {0}")
	public void userVerifyThePageAndClickOn(String appleproduct) {

		selectproductfromsubcat s = new selectproductfromsubcat();
		s.selectProduct(appleproduct);

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user select the product with lowest price")
	public void selectTheProductWithLowestPrice() {

		
		productTestPage.clickonlowestprice();

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user tap on addtocart")
	public void UserTapOnAddtocart() {
		QAFTestBase.pause(5000);
		addtocartTestPage.clickonaddtocart();

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user verify the product is added to cart")
	public void UserVerifyTheProductIsAddedToCart() {
		addtocartTestPage.verifyproductadded();
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user select the product with highest price")
	public void selectProductWithHighestPrice() {


		productTestPage.getPricehightolowLnkProductpage().click();
		
	}
}
