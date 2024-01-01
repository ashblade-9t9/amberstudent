package genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	PropertyFile pdata = new PropertyFile();
	protected WebDriverUtilities utilities = new WebDriverUtilities();
	protected Screenshot ss = new Screenshot();
	
	
	@BeforeMethod
	public void openAmberStudentWebPage()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver =new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://amberstudent.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void closeWebPage()
	{
		
		driver.quit();
	}

}
