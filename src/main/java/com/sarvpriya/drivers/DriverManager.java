package com.sarvpriya.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	

	private DriverManager()
	{
		
	}
	
	/*
	 * private static ThreadLocal<WebDriver>
	 * threadLocalDriver=ThreadLocal.withInitial(()-> {
	 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); });
	 */
	
	private static ThreadLocal<WebDriver> threadLocalDriver=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return threadLocalDriver.get();
	}
	
	public static void setDriver(WebDriver driver)
	{
		threadLocalDriver.set(driver);
	}
	
	public static void unfold()
	{
		threadLocalDriver.remove();
	}


}
