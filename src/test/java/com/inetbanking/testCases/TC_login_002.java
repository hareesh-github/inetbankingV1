package com.inetbanking.testCases;



import java.io.IOException;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;
import com.inetbanking.utilities.XLUtils;

import junit.framework.Assert;

public class TC_login_002 extends BaseClass
{
@Test(dataProvider="LoginData")
public void loginDDT(String user,String pwd) throws Throwable
{
	LoginPage lp=new LoginPage(driver);
	//lp.clickSubmit1();
	//lp.clickSubmit2();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	lp.setUserName(user);
	lp.setPassword(pwd);
	
	lp.clickSubmit();
	//Thread.sleep(3000);
	if(isAlertPresent()==false)
	{
		
	Assert.assertTrue(true);
	//Thread.sleep(3000);
	logger.info("Login passed");
	lp.clickLogout();
	

	
}
	else
	{
		captureScreen(driver,"loginDDT");
		driver.switchTo().alert().accept();
		//Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//Thread.sleep(3000);
	Assert.assertTrue(false);
	logger.warn("login failed");

	}}
public boolean isAlertPresent()
{
	try 
	{
		
		
	driver.switchTo().alert();
	return true;
	}
	catch (Exception e)
	{
		return false;
	}
}

	

@DataProvider(name="LoginData")
String [][] getData() throws IOException
{
	String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/Username.xlsx";
	int rownum=XLUtils.getRowCount(path,"Sheet1" );
	int colcount=XLUtils.getCellCount(path,"Sheet1",1 );

	String logindata[][]=new String[rownum][colcount];
	
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
		}
	}
	return logindata;
}
}

