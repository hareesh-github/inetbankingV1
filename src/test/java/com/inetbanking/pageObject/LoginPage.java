
package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="details-button")
	 @CacheLookup
	WebElement adv;
	
	@FindBy(id="proceed-link")
	 @CacheLookup
	WebElement pro;
	
	
 @FindBy(name="uid")
 @CacheLookup
WebElement txtUserName;

@FindBy(name="password")
@CacheLookup
WebElement txtPassword;

@FindBy(name="btnLogin")
@CacheLookup
WebElement btnLogin;


@FindBy(xpath="//a[contains(text(),'Log out')]")
@CacheLookup
WebElement logout;

public void setUserName(String uname)
{
	txtUserName.sendKeys(uname);
	
}

public void setPassword(String uname)
{
	txtPassword.sendKeys(uname);
	
}

public void clickSubmit()
{
 btnLogin.click();
	
}
public void clickLogout()
{
	logout.click();
	
}



public void clickSubmit2() {
	// TODO Auto-generated method stub
	pro.click();
}

public void clickSubmit1() {
	// TODO Auto-generated method stub
	adv.click();
}




}
