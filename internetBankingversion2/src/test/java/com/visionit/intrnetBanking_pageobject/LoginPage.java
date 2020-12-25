package com.visionit.intrnetBanking_pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
@FindBy(name="uid")
WebElement userid;
@FindBy(name="password")
WebElement password;
@FindBy(name="btnLogin")
WebElement btnlogin;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void  LoginInternetBankingPage(String UserId,String Pass) {
	userid.sendKeys(UserId);	
	password.sendKeys(Pass);
	btnlogin.click();
}
}