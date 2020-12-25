package com.visionit.internetBanking.testcases;

import org.testng.annotations.Test;

import com.visionit.intenetBanking.testBase.TestBase;
import com.visionit.intrnetBanking_pageobject.LoginPage;

public class LoginTest extends TestBase {
	@Test
	public void LoginInternetBankingPageTest() {
	LoginPage login =	new LoginPage(driver);
	login.LoginInternetBankingPage(configData.getUserID(), configData.getUserPassword());
	}

}
