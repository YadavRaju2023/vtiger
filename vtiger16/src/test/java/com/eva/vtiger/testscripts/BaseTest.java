package com.eva.vtiger.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.eva.vtiger.pages.common.CommonReusableCodes;
import com.eva.vtiger.utils.WebUtil;

import lombok.Getter;

@Getter
public class BaseTest   {
	
	private	WebUtil webUtil= WebUtil.getObject();
	private CommonReusableCodes reuseCode; 
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Extent-Report Initialization");
	}
	
	@BeforeTest
	public void beforeTestTag() {
		System.out.println("Connect To The Data Base");
	}
	
	@BeforeClass
	public void beforeTestCases() {
		webUtil.launchBrowser();
		webUtil.goToHitUrl("http://localhost:8888");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		reuseCode=new CommonReusableCodes(webUtil); 
		reuseCode.login();
	}
	
	@AfterMethod
	public void afterMethod() {
		reuseCode.logOut();
	}
	
	@AfterClass
	public void afterClass() {
		webUtil.quit();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Disconnect   From The Data Base");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Extent-Report Finalization");
	}

	
	
}
