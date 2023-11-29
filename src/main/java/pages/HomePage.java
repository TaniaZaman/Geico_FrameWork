package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static commonAction.CommonActions.*;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
//	@FindBy(xpath="//span[@class='header-link']")
//	WebElement menu;
	
	
	@FindBy(xpath="//a[@class='icon-geico']")
	WebElement logo;
	
	@FindBy(xpath="//a[text()='Our Commitment to Diversity, Equity and Inclusion']")
	WebElement announcement;
	
//	
//	@FindBy(xpath="//input[@id='ssp-service-zip']")
//	WebElement enterZipCode;
//	
//	@FindBy(xpath="//input[@class='btn btn--secondary']")
//	WebElement go;
	
	@FindBy(xpath="//span[text()='Log In']//preceding-sibling::span[@class='icon-profile']")
	WebElement log_in;
	
	@FindBy(xpath="//button[@id='manageSubmit']")
	WebElement login;
	
	@FindBy(xpath = "//input[@id='TextInputComponent-1']")
	WebElement userId;//id
	
	@FindBy(xpath = "//input[@id='TextInputComponent-2']")
	WebElement password;
	
	@FindBy(name= "SubmitButtonComponent-1")
	WebElement loginButton;
	
	
	
	
	public void clickMenu() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='header-link']")).click();
		Thread.sleep(5000);
	}
	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(5000);
	}
	public void clickAnnouncement() throws InterruptedException {
		announcement.click();
		Thread.sleep(5000);
	}
//	public void clickEnterZipCode() throws InterruptedException {
//		enterZipCode.click();
//		Thread.sleep(5000);
//	}
	public void inputTextZipCodeField () {
		driver.findElement(By.cssSelector("input#ssp-service-zip")).sendKeys("21244"); 
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		public void clickGo() throws InterruptedException {
			driver.findElement(By.cssSelector("input.btn.btn--secondary")).click();
			
		
	}

//		public void clickLog_In() throws InterruptedException {
//			clickElement(log_in);
//			Thread.sleep(5000);
//		}
//			
//			public void clickLogIn() throws InterruptedException {
//				clickElement(login);
//				Thread.sleep(5000);
//		}
			 
		public void clickUserID() throws InterruptedException {
			clickElement(userId);
			Thread.sleep(5000);
		}
		
		public void clickPassword() throws InterruptedException {
			clickElement(password);
			Thread.sleep(5000);
		}
		//Using Common Action Here
		public void inputTextUserIdAndPassWord() throws InterruptedException {
			clickElement(log_in);
			clickElement(login);
			inputText(userId, "fgjgff");
			inputText(password, "1234");
			clickElement(loginButton);
			Thread.sleep(3000);
			
		}
		
		public void clickInsuranceType() {
			driver.findElement(By.linkText("View More Insurance Types")).click();;
		}
		public void clickContinueSavedQoute() {
			driver.findElement(By.partialLinkText("Continue Your Saved")).click();;
		}
}
