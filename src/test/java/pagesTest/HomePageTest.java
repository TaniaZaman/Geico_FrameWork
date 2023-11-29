package pagesTest;

import java.time.Duration;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true)
	public void clickMenuTest() throws InterruptedException {
		homePage.clickMenu();

	}

	@Test(enabled = true)
	public void clickInsuranceTypeTest() throws InterruptedException {
		homePage.clickInsuranceType();
		Thread.sleep(5000);

	}

	@Test(enabled = true)
	public void clickContinueSavedQouteTest() throws InterruptedException {
		homePage.clickContinueSavedQoute();
		;
		Thread.sleep(5000);

	}

	@Test(enabled = true)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();

	}

	@Test(enabled = true)
	public void clickAnnouncementTest() throws InterruptedException {
		homePage.clickAnnouncement();

	}

//	  @Test(enabled=true) 
//	  public void clickZipCodeTest() throws
//	  InterruptedException{ homePage.clickEnterZipCode();
//	  
//	  }

	@Test(enabled = true)
	public void inputZipCodeTest() throws InterruptedException {
		homePage.inputTextZipCodeField();
		homePage.clickGo();

	}

//	  @Test(enabled=true) 
//	  public void clickGoTest() throws InterruptedException{
//	  homePage.clickGo();
//	  
//	  }

	@Test(enabled = true)
	public void inputTextInUserIdAndPasswordFieldThenClickLoginButtonTest() throws InterruptedException {
		homePage.inputTextUserIdAndPassWord();
	}

	@Test(enabled = true)
	public void use_of_isDisplayed_in_logo_image() throws InterruptedException {
		boolean logoDisplayed = driver.findElement(By.cssSelector("a.icon-geico")).isDisplayed();
		System.out.println("Is the Logo displayed? Ans: " + logoDisplayed);
	}

	@Test(enabled = true)
	public void use_of_isEnabled_in_login_button() throws InterruptedException {
		boolean loginEnabled = driver
				.findElement(By.xpath("//span[text()='Log In']//preceding-sibling::span[@class='icon-profile']"))
				.isDisplayed();
		System.out.println("Is the Login Button Enabled? Ans: " + loginEnabled);
	}

	@Test(enabled = true)
	public void use_of_isSelected_in_check_box() throws InterruptedException {
		driver.navigate().to("https://enthrallit.com/selenium/");
		driver.findElement(By.xpath("(//input[@id='flexCheckDefault'])[1]")).click();
		boolean checkboxSelected = driver.findElement(By.xpath("(//input[@id='flexCheckDefault'])[1]")).isSelected();
		System.out.println("Is the Auto Vehicle selected? Ans: " + checkboxSelected);
		Thread.sleep(3000);
	}

	@Test(enabled = true)
	public void use_of_getTitle_method_in_homePage() throws InterruptedException {
		System.out.println("The Title of the page is: " + driver.getTitle());
		Thread.sleep(3000);
	}

	// using Login button
	@Test(enabled = true)
	public void use_of_getCurrentUrl_method_login_button() throws InterruptedException {
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).click();
		System.out.println("The Title of the page is: " + driver.getTitle());
		System.out.println("The Current URL  of the page is: " + driver.getCurrentUrl());
		Thread.sleep(3000);
	}

	// using Login button
	@Test(enabled = true)
	public void use_of_getText_method_in_login_button() throws InterruptedException {
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).isSelected();
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).click();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).isSelected();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).sendKeys("vxdgdhdh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='TextInputComponent-2']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-2']")).sendKeys("vxdgdhdh");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("label.checkbox")).isSelected();
		driver.findElement(By.cssSelector("label.checkbox")).click();

		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).isEnabled();
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),' Login')]"));
		System.out.println("The text for the WebElement is: " + loginButton.getText());
		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();

		Thread.sleep(3000);
	}
	
	// using Login button
		@Test(enabled = true)
		public void use_of_getAttribute_method() throws InterruptedException {
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).isSelected();
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).click();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).isSelected();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).isDisplayed();
		Thread.sleep(3000);
		String value1 = driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).getAttribute("id");
		String value2 = driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).getAttribute("placeholder.type");
		String value3 = driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).getAttribute("name");
		String value4 = driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).getAttribute("class");
		System.out.println("The value of the id attribute is: " + value1);
		System.out.println("The value of the placeholder attribute is: " + value2);
		System.out.println("The value of the name attribute is: " + value3);
		System.out.println("The value of the class attribute is: " + value4);
		}

	// using Login button
	@Test(enabled = true)
	public void use_of_sendKeys_method_then_clear() throws InterruptedException {
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).isSelected();
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).click();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).isSelected();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).sendKeys("vxdgdhdh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='TextInputComponent-2']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-2']")).sendKeys("vxdgdhdh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='TextInputComponent-2']")).clear();
		Thread.sleep(3000);

		
	}
	// using Login button
	@Test(enabled = true)
	public void use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop () throws InterruptedException {
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).isSelected();
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).click();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).isSelected();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).sendKeys("vxdgdhdh", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='TextInputComponent-2']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='TextInputComponent-2']")).sendKeys("vxdgdhdh", Keys.ENTER);
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).click();
		
		
	}
	// using Login button
	@Test(enabled = true)
	public void use_of_sendKeys_method_then_click_by_return_key_of_the_laptop() throws InterruptedException {
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).isSelected();
		driver.findElement(By.cssSelector("a[data-side-panel-trigger='account']")).click();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).isSelected();
		driver.findElement(By.xpath("(//button[@id='manageSubmit'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgot User ID/Password')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.ng-pristine.ng-valid.ng-touched")).sendKeys("vxdgdhdh", Keys.RETURN);
		Thread.sleep(5000);
	}

	@Test(enabled = true)
	public void use_of_navigate_method () throws InterruptedException {
		driver.navigate().to("https://enthrallit.com/selenium/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
	}




	

}
