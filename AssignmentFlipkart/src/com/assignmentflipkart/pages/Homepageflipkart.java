package com.assignmentflipkart.pages;

import org.hamcrest.*;
import org.openqa.selenium.interactions.Actions;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class Homepageflipkart  extends WebDriverBaseTestPage<WebDriverTestPage>{

	
	
	@FindBy(locator = "homepage.lnk.catagoryname")
	private QAFWebElement homepageLnkMenuname;
	
	@FindBy(locator = "homepage.lnk.subcatagory")
	private QAFWebElement homepageLnkSubmenuname;
	
	@FindBy(locator = "homepage.btn.popup")
	private QAFWebElement homepagepopup;
	

	public QAFWebElement getHomepageLnkMenuname() {
		return homepageLnkMenuname;
	}

	public QAFWebElement getHomepageLnkSubmenuname() {
		return homepageLnkSubmenuname;
	}

	
	public QAFWebElement getHomepagepopup() {
		return homepagepopup;
	}

	public void selectCatogory(String subcatagory, String catagory) {
		QAFExtendedWebElement catogoryName = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString("homepage.lnk.catagoryname"), catagory));

		Actions action = new Actions(driver);
		action.moveToElement(catogoryName).build().perform();

		QAFExtendedWebElement subCatogoryName = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString("homepage.lnk.subcatagory"), subcatagory));
   
		subCatogoryName.waitForVisible();
		subCatogoryName.click();
	}
	
	
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	public void lanchflipkartsite() {
		
		driver.get("/");
		//driver.manage().window().maximize();
		 try {
			   if (getHomepagepopup().isDisplayed()) {
			    getHomepagepopup().click();
			    
			   } else {
			   System.out.println("popup is not there");
			    
			   }
			  } catch (Exception e) {
		
	}}
	
	public void verifyHomepage() {
		
		 Validator.verifyThat("Flipkart homepage Verification",driver.getTitle(),Matchers.containsString("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"));	
	}

	
	

	

}
