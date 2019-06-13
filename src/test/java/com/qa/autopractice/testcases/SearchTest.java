package com.qa.autopractice.testcases;

import org.testng.annotations.Test;

import com.qa.autopractice.base.TestBase;
import com.qa.autopractice.pages.AutoPracticeHomePage;
import com.qa.autopractice.util.TestUtil;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class SearchTest extends TestBase {
	
	AutoPracticeHomePage aphp =null;
	
  public SearchTest() throws IOException {
		super();
		
	}
@Test
  public void searchTest() {
	
  }
  @BeforeClass
  
  public void beforeClass() throws IOException, InterruptedException {
	  initWebdriver();
	  aphp=new AutoPracticeHomePage();
	 // aphp.verifyAutopractice();
	  TestUtil.scrollDownPage();
	  aphp.mouseoverActions();
	  aphp.SwitchToPwinToChwin();
	  
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	  TestUtil.scrollupPage();
	  driver.close();
  }

}
