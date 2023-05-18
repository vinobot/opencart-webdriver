package com.framework.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class BaseMethods extends SeleniumBase {

	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}
	
	@BeforeMethod
	public void preCondition() {
		startApp("chrome", false, "http://65.0.72.176/");
		setNode();

	}
	
	@AfterMethod
	public void postCondition() {
		close();

	}

	

	
	  

	
	
}
