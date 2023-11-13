package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//span[@class='header-link']")
	WebElement menu;
	
	@FindBy(xpath="//span[text()='Log In']//preceding-sibling::span[@class='icon-profile']")
	WebElement log_in;
	
	@FindBy(xpath="//a[@class='icon-geico']")
	WebElement logo;
	
	@FindBy(xpath="//a[text()='Our Commitment to Diversity, Equity and Inclusion']")
	WebElement announcement;
	
	
	@FindBy(xpath="//input[@id='ssp-service-zip']")
	WebElement enterZipCode;
	
	@FindBy(xpath="//input[@class='btn btn--secondary']")
	WebElement go;
	
	
	public void clickMenu() throws InterruptedException {
		menu.click();
		Thread.sleep(5000);
	}
	public void clickLogIn() throws InterruptedException {
		log_in.click();
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
	public void clickEnterZipCode() throws InterruptedException {
		enterZipCode.click();
		Thread.sleep(5000);
	}
	public void inputTextInUserIdField () {
		enterZipCode.sendKeys("21244"); 
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		public void clickGo() throws InterruptedException {
			go.click();
			Thread.sleep(5000);
		
	}

}
