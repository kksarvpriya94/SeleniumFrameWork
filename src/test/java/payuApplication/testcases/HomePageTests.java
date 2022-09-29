package payuApplication.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.sarvpriya.drivers.DriverManager;


public final class HomePageTests extends TestBase{

private HomePageTests()
{
	
}
	@Test
	public void test1()
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Happy Testing",Keys.ENTER);
		DriverManager.getDriver().switchTo().newWindow(WindowType.TAB).get("https://payu.in");

	}

	@Test
	public void test2()
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Happy Sarvpriya",Keys.ENTER);
		DriverManager.getDriver().switchTo().newWindow(WindowType.TAB).get("https://payu.in");
	}

}
