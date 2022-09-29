package com.sarvpriya.drivers;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	private Driver()
	{
		
	}
	
	private static WebDriver driverRef;
	public static void initDriver()
	{
		if(Objects.isNull(DriverManager.getDriver()))
		{
		WebDriverManager.chromedriver().setup(); 
		driverRef=new ChromeDriver();
        DriverManager.setDriver(driverRef);
        DriverManager.getDriver().get("https://www.google.com/");
        DriverManager.getDriver().manage().window().maximize();
		}
	}
	
	public static void quitDriver()
	{
		if(Objects.nonNull(driverRef))
		{
			DriverManager.getDriver().quit();
			DriverManager.unfold();
		}
		
	}

}
