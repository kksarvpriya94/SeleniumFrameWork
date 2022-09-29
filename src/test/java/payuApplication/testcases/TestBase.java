package payuApplication.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sarvpriya.drivers.Driver;

public class TestBase {
	
	protected TestBase()
	{
		
	}
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown()
	{
		Driver.quitDriver();
	}

}
