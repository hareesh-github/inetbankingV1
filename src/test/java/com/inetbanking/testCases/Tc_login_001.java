package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;



public class Tc_login_001 extends BaseClass
{
 @Test
public void loginTest() throws IOException
 {
	 driver.get(baseURL);
	 logger.info("url is opened");
		LoginPage lp=new LoginPage(driver);
	//	lp.clickSubmit1();
	//	 logger.info(" clickes adv");
		// lp.clickSubmit2();
		// logger.info(" clickes pro");
		lp.setUserName(username);
		 logger.info(" enter username");
		lp.setPassword(password);
		 logger.info("enter password");
		lp.clickSubmit();
		
		if(driver.getCurrentUrl().equals("https://demo.guru99.com/v4/manager/Managerhomepage.php"))
			// logger.info("login test if " );
		{
			
			Assert.assertTrue(true);
			 logger.info("login test passed" );
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			 logger.info("login test failed");
			
		}
	}

}
 
