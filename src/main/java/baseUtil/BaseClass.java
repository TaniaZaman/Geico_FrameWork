package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

public class BaseClass {
	
	public WebDriver driver;
	public HomePage homePage;
	Configuration configuration;
	
	@BeforeMethod
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//driver = new ChromeDriver();
		//System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
		//driver = new FirefoxDriver();
		//System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		//driver = new EdgeDriver();
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		
		configuration = new Configuration();
		initDriver();
		
		driver.get(configuration.getProperties(URL));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		long pageLoadWait = Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long implicitly_Wait = Long.parseLong(configuration.getProperties(IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitly_Wait));
		initClass();
		//homePage = new HomePage(driver);
		Actions actions = new Actions(driver);
	}
	
	public void initDriver() {
		String browserName = configuration.getProperties(BROWSER);
		
		switch(browserName) {
		
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "FIREFOX":
			System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "EDGE":
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
			
		}
		
	}
	
	public void initClass() {
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