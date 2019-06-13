package com.qa.autopractice.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qa.autopractice.base.TestBase;

public class TestUtil extends TestBase {

	public TestUtil() throws IOException {
		super();
		
	}
	public static final long IMPLICIT_WAIT=30;
	public static final long EXPLICIT_WAIT=60;
	
	public static void scrollDownPage() throws InterruptedException {
	//assign driver variable to JavascriptExecuteor interface variable
			JavascriptExecutor jsx=(JavascriptExecutor)driver;
			
			//scroll down
			jsx.executeScript("window.scrollBy(0,500)"," ");
			
			Thread.sleep(3000);
			
			
			//if you want scroll for particular element 
			//identyfy the element
			WebElement popimg=driver.findElement(By.xpath("//*[contains(@class,'replace-2x img-responsive')]"));
			
			jsx.executeScript("arguments[0].scrollIntoView(true);", popimg);
			
			Thread.sleep(5000);
	}
	
	public static void scrollupPage() throws InterruptedException {
		
		 String pid=driver.getWindowHandle();
		 driver.switchTo().window(pid);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		
				
				//scroll up
				jsx.executeScript("window.scrollBy(0,-500)"," ");
				
				Thread.sleep(3000);
				
				//if you want scroll for particular element 
				//identyfy the element
				WebElement backtotop=driver.findElement(By.xpath("//*[@class='logo img-responsive']"));
				
				jsx.executeScript("arguments[0].scrollIntoView(true);", backtotop);
				
				//Thread.sleep(5000);
	}
			

}
