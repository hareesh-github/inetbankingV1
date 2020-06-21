package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
WebDriver ldriver;
public   AddCustomer(WebDriver rdriver)

{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
@FindBy(how=How.XPATH,using="//a[contains(text(),'New Customer')]")
@CacheLookup
WebElement linkAddCustomer;

@FindBy(how=How.NAME,using="name")
@CacheLookup
WebElement txtCustomername;


@FindBy(how=How.NAME,using="rad1")
@CacheLookup
WebElement rgender;

@FindBy(how=How.ID_OR_NAME,using="dob")
@CacheLookup
WebElement txtdob;

@FindBy(how=How.NAME,using="addr")
@CacheLookup
WebElement txtaddrs;


@FindBy(how=How.NAME,using="city")
@CacheLookup
WebElement txtcity;

@FindBy(how=How.NAME,using="state")
@CacheLookup
WebElement txtstate;

@FindBy(how=How.NAME,using="pinno")
@CacheLookup
WebElement txtpin;

@FindBy(how=How.NAME,using="telephoneno")
@CacheLookup
WebElement txttelephone;


@FindBy(how=How.NAME,using="emailid")
@CacheLookup
WebElement txtemail;



@FindBy(how=How.ID_OR_NAME,using="password")
@CacheLookup
WebElement txtpassword;

@FindBy(how=How.NAME,using="sub")
@CacheLookup
WebElement txtsub;





public void clickAddNewCustomer() {
	linkAddCustomer.click();
		
}

public void custName(String cname) {
	txtCustomername.sendKeys(cname);
	
}

public void custgender(String cgender) {
	rgender.click();
}

public void custdob(String mm,String dd,String yy) {
	txtdob.sendKeys(mm);
	txtdob.sendKeys(dd);
	txtdob.sendKeys(yy);
	
}

public void custaddress(String caddress) {
	txtaddrs.sendKeys(caddress);
}

public void custcity(String ccity) {
	txtcity.sendKeys(ccity);
}

public void custstate(String cstate) {
	txtstate.sendKeys(cstate);
}

public void custpinno(String cpinno) {
	txtpin.sendKeys(cpinno);
}

public void custtelephoneno(String ctelephoneno) {
	txttelephone.sendKeys(ctelephoneno);
}

public void custemailid(String cemailid) {
	txtemail.sendKeys(cemailid);
}

public void custpassword(String cpassword) {
	txtpassword.sendKeys(cpassword);
}

public void custsubmit() {
	txtsub.click();
}



}


