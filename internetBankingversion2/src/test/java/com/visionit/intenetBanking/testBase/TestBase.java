package com.visionit.intenetBanking.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.visionit.internetBanking.utilities.ConfigDataProvider;


//import com.visionit.orangehrm.utilities.XLSXDataProvider;

public class TestBase {
	public static WebDriver driver;
	public ConfigDataProvider configData;
	@BeforeSuite 
	public void setupSuite() {
	configData=new ConfigDataProvider();
	//xlsxData=new XLSXDataProvider();
	}
	@Parameters("Browser")
	@BeforeMethod
	public void setUp(@Optional("Chrome")String browserName) {
		if(browserName.equals("Chrome")) {
	
			
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

			driver=new ChromeDriver();
			}
			else if(browserName.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");

				driver=new FirefoxDriver();

			}	
	//	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get(configData.getAppUrl());

	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
		@AfterMethod
		public void tearDown(){
		driver.quit();

}
}