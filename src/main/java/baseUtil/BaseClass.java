package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	
	public WebDriver driver;
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		driver.get("https://www.geico.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}
	
//	@BeforeMethod
//	 public void setUp() {
//		String baseDir = System.getProperty("user.dir");
//		String chromeDir = baseDir +"/Driver/chromedriver.exe";
//			 System.setProperty("webdriver.chrome.driver",chromeDir);
//			
//			//WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.get("https://www.geico.com");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			homePage = new HomePage(driver);
//		}
	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}