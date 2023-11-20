package pagesTest;


import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test(enabled=true)
	public void clickMenuTest() throws InterruptedException{
		homePage.clickMenu();
		
	}
	@Test(enabled=true)
	public void clickInsuranceTypeTest() throws InterruptedException{
		homePage.clickInsuranceType();
		Thread.sleep(5000);
		
	}
	@Test(enabled=true)
	public void clickContinueSavedQouteTest() throws InterruptedException{
		homePage.clickContinueSavedQoute();;
		Thread.sleep(5000);
		
	}
	

	 
	  @Test(enabled=true) 
	  public void clickLogoTest() throws InterruptedException{
	  homePage.clickLogo();
	  
	  }
	  
	  @Test(enabled=true) 
	  public void clickAnnouncementTest() throws
	  InterruptedException{ homePage.clickAnnouncement();
	  
	  }
	  
//	  @Test(enabled=true) 
//	  public void clickZipCodeTest() throws
//	  InterruptedException{ homePage.clickEnterZipCode();
//	  
//	  }
	  
	  @Test(enabled=true) 
	  public void inputZipCodeTest() throws InterruptedException{
		  homePage.inputTextZipCodeField();
		  homePage.clickGo();
	  
	  }
	 
//	  @Test(enabled=true) 
//	  public void clickGoTest() throws InterruptedException{
//	  homePage.clickGo();
//	  
//	  }
 
	  @Test(enabled =true)
	  public void inputTextInUserIdAndPasswordFieldThenClickLoginButtonTest() throws InterruptedException {
		  homePage.inputTextUserIdAndPassWord();
	  }

}