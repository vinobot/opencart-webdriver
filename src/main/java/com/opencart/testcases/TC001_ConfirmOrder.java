package com.opencart.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.BaseMethods;
import com.opencart.pages.HomePage;


public class TC001_ConfirmOrder extends BaseMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Order";
		testDescription ="Verify the order is Confirmed";
		authors="Babu";
		category ="Smoke";
		excelFileName="Opencart";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCart(String searchItem, String city, String country,String postalCode,String zone) {
		new HomePage()
		.searchItem(searchItem)		
		.clickAddToCart()
		.clickShoppingcart()
		.clickCheckOut()
		.clickGuestCheckOut()
		.enterFirstName()
		.enterLastName()
		.enterEmailAddress()
		.enterCompanyName()
		.enterAddress()
		.enterCity(city)
		.selectCountry(country)
		.enterPostalCode(postalCode)
		.selectRegion(zone)
		.clickContinue()
		.chooseShippingMethod()
		.selectShippingMethod()
		.choosePaymentMethod()
		.SelectPaymentMethod()
		.clickPaymentContiue()
		.addComment()
		.clickConfirm();
		
	}

}
