package com.opencart.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BaseMethods;

public class HomePage extends BaseMethods {

	public HomePage searchItem(String item) {
		typeAndEnter(locateElement(Locators.NAME,"search"), item);
		return this;

	}

	public HomePage clickAddToCart() {
		clickUsingJs(locateElement(Locators.XPATH,"//i[@class='fa-solid fa-shopping-cart']"));
		return this;

	}

	public HomePage verifyMessage() {
		verifyExactText(locateElement(Locators.XPATH,"//div[contains(@class,'alert')]"), "Success");
		return this;

	}

	public HomePage clickShoppingcart() {
		clickUsingJs(locateElement(Locators.XPATH,"//span[text()='Shopping Cart']"));
		return this;

	}

	public CheckOutPage clickCheckOut() {
		click(locateElement(Locators.LINK_TEXT,"Checkout"));
		return new CheckOutPage();

	}

}
