package com.qa.autopractice.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.autopractice.base.TestBase;

public class AutoPracticeHomePage extends TestBase {

	public AutoPracticeHomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="logo img-responsive")
	WebElement autopractice_logo;
	
	@FindBy(xpath="//*[contains(@class,'replace-2x img-responsive')]")
	WebElement popular_img;
	
	@FindBy(xpath="//a[@title='Add to cart']")
	WebElement addtocart_ele;
	
	@FindBy(xpath="//*[contains(@class,'layer_cart_product col-xs-12 col-md-6')]")
	WebElement chwin_addsuccess;
	
	@FindBy(xpath="//*[@title='Continue shopping']")
	WebElement continue_shopping;


//verify linkedin logo present or not

	public boolean verifyAutopractice() {
		return autopractice_logo.isDisplayed();
	}
	//verify the landing page title
		//public String getautopracticeLandindTitle() {
			//return driver.getTitle();
			
		//}
		
	public void mouseoverActions() throws InterruptedException {
		//create object for actions class
		Actions act=new Actions(driver);
		
		act.moveToElement(popular_img).perform();
		 addtocart_ele.click();
		 Thread.sleep(3000);
		
	}
	
	public  void SwitchToPwinToChwin() {
		
		//fetch the parent window id
				String pid=driver.getWindowHandle();
				
				//fetch all window ids
				Set<String>handles=driver.getWindowHandles();
			/*
				//iterate with iterator() (or) for each loop
				Iterator it=handles.iterator();
				while(it.hasNext()) {
					if(!pid.equals(it.next())) {
						//switch to child window
						driver.switchTo().window((String) it.next());
						//close the child window
						driver.close();
					}
				}
				//switch to the parent window
				driver.switchTo().window(pid);
				
				*/
				//      (OR)
				
				for(String h:handles) {
					if(!pid.equals(h)) {
						//switch to child window
						driver.switchTo().window(h);
						//close the child window
						
					}
				}
				//switch back to parent window
				driver.switchTo().window(pid);
				
				//veryfy the naukri logo( wecan use this css formula also->css=tagname.classname or css=tagname(class='classvalue')
				wait.until(ExpectedConditions.visibilityOf(chwin_addsuccess));
				continue_shopping.click();
			}

	}
	

