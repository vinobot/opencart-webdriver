package com.opencart.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BaseMethods;

public class OrderConfirmPage  extends BaseMethods{
	
	
	public OrderConfirmPage verifyOrderstatus() {
		verifyPartialText(locateElement(Locators.XPATH, "//h1[text()='Your order has been placed!']"), "placed");
		return this;
	}

}

