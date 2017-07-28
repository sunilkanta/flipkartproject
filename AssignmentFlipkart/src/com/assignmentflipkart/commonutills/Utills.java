package com.assignmentflipkart.commonutills;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;

public class Utills extends WebDriverBaseTestPage<WebDriverTestPage>{
	

	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(String switchto) {
		String windowIdbefore = "";
		if (switchto.equalsIgnoreCase("switchtohildwindow")) {

			windowIdbefore = driver.getWindowHandle();
			System.out.println(windowIdbefore);
			Set<String> windowid = driver.getWindowHandles();
			for (String string : windowid) {
				System.out.println(string);

				driver.switchTo().window(string);

			}

		} else if (switchto.equalsIgnoreCase("switchtoparentwindow")) {
			driver.switchTo().window(windowIdbefore);
			QAFTestBase.pause(3000);
		}
	}
	
	
	public void switchToFrame(){
		
		 List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		    System.out.println("Number of frames in a page :" + ele.size());
		    for(WebElement el : ele){
		      //Returns the Id of a frame.
		        System.out.println("Frame Id :" + el.getAttribute("id"));
		      //Returns the Name of a frame.
		        //System.out.println("Frame name :" + el.getAttribute("name"));   
		    }
		    driver.switchTo().frame("partner_form"); 
	}

	public void switchToAlert(){
		
		driver.switchTo().alert();
	}
	
	
	}
	
	


