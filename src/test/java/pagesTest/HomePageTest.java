package pagesTest;


import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test(enabled=false)
	public void clickMenuTest() throws InterruptedException{
		homePage.clickMenu();
		
	}
	
	  @Test(enabled=false)
	  public void clickLoginTest() throws InterruptedException{
	  homePage.clickLogIn();
	  
	  }
	 
	  @Test(enabled=false) 
	  public void clickLogoTest() throws InterruptedException{
	  homePage.clickLogo();
	  
	  }
	  
	  @Test(enabled=false) 
	  public void clickAnnouncementTest() throws
	  InterruptedException{ homePage.clickAnnouncement();
	  
	  }
	  
	  @Test(enabled=false) 
	  public void clickZipCodeTest() throws
	  InterruptedException{ homePage.clickEnterZipCode();
	  
	  }
	  
	  @Test(enabled=true) 
	  public void inputZipCodeTest() throws InterruptedException{
		  homePage.inputTextInUserIdField();
		  homePage.clickGo();
	  
	  }
	 
//	  @Test(enabled=true) 
//	  public void clickGoTest() throws InterruptedException{
//	  homePage.clickGo();
//	  
//	  }
//	 

}