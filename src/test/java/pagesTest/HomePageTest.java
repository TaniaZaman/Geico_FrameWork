package pagesTest;


import org.openqa.selenium.By;
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
	  
	  @Test(enabled =true)
	  public void use_of_isDisplayed_in_logo_image() throws InterruptedException {
		  boolean logoDisplayed = driver.findElement(By.cssSelector("a.icon-geico")).isDisplayed();
		  System.out.println("Is the Logo displayed? Ans: " + logoDisplayed);
	  }
	  
	  @Test(enabled =true)
	  public void use_of_isEnabled_in_login_button() throws InterruptedException {
		  boolean loginEnabled = driver.findElement(By.xpath("//span[text()='Log In']//preceding-sibling::span[@class='icon-profile']")).isDisplayed();
		  System.out.println("Is the Login Button Enabled? Ans: " + loginEnabled);
	  }
	  
	  @Test(enabled =true)
	  public void use_of_isSelected_in_check_box() throws InterruptedException {
		  driver.findElement(By.xpath("(//div[@class='product-checkbox'])[1]")).click();
		  boolean checkboxSelected = driver.findElement(By.xpath("(//div[@class='product-checkbox'])[1]")).isSelected();
		  System.out.println("Is the Auto Vehicle selected? Ans: " + checkboxSelected);
		  Thread.sleep(3000);
	  }

}