package com.opencart.pages;


import com.framework.data.dynamic.FakerDataFactory;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.BaseMethods;

public class CheckOutPage extends BaseMethods {

	public CheckOutPage clickGuestCheckOut() {
		click(locateElement(Locators.XPATH,"//input[@id='input-guest']"));
		return this;

	}

	public CheckOutPage enterFirstName() {
		String firstName = FakerDataFactory.getFirstName();
		type(locateElement(Locators.ID, "input-firstname"),firstName);
		return this;

	}

	public CheckOutPage enterLastName() {
		String lastName = FakerDataFactory.getLastName();
		type(locateElement(Locators.ID, "input-lastname"),lastName);

		return this;

	}

	public CheckOutPage enterEmailAddress() {
		String randomMail = FakerDataFactory.getEmailAddress();
		type(locateElement(Locators.ID, "input-email"),randomMail);

		return this;

	}

	public CheckOutPage enterCompanyName() {
		String companyName = FakerDataFactory.getCompanyName();
		type(locateElement(Locators.ID, "input-shipping-company"),companyName);

		return this;

	}

	public CheckOutPage enterAddress() {
		String address = FakerDataFactory.getAddress();
		type(locateElement(Locators.ID, "input-shipping-address-1"),address);
		return this;

	}

	public CheckOutPage enterCity(String City) {
		type(locateElement(Locators.ID, "input-shipping-city"),City);
		return this;

	}

	public CheckOutPage selectCountry(String country) {
		selectDropDownUsingText(locateElement(Locators.ID,"input-shipping-country"),country);
		return this;

	}

	public CheckOutPage enterPostalCode(String postalCode) {
		type(locateElement(Locators.ID,"input-shipping-postcode"), postalCode);
		return this;
	}

	public CheckOutPage selectRegion(String zone) {
		selectDropDownUsingText(locateElement(Locators.ID,"input-shipping-zone"),zone);
		return this;

	}

	public CheckOutPage clickContinue() {
		click(locateElement(Locators.XPATH,"//button[text()='Continue']"));
		return this;

	}

	public CheckOutPage chooseShippingMethod() {
		click(locateElement(Locators.XPATH,"//button[@id='button-shipping-methods']"));
		return this;

	}

	public CheckOutPage selectShippingMethod() {
		click(locateElement(Locators.XPATH,"//input[@id='input-shipping-method-flat-flat']"));
		click(locateElement(Locators.XPATH,"//button[@id='button-shipping-method' and text()='Continue']"));
		return this;

	}

	public CheckOutPage choosePaymentMethod() {
		click(locateElement(Locators.XPATH,"//button[@id='button-payment-methods']"));
		return this;

	}

	public CheckOutPage SelectPaymentMethod() {
		click(locateElement(Locators.XPATH,"//input[@id='input-payment-method-cod-cod']"));
		click(locateElement(Locators.XPATH,"//button[@id='button-payment-method' and text()='Continue']"));
		return this;

	}

	public CheckOutPage clickPaymentContiue() {
		click(locateElement(Locators.XPATH,"//button[text()='Continue']"));
		return this;

	}
	public CheckOutPage addComment() {
		type(locateElement(Locators.XPATH,"//textarea"),"Added iMac");
		return this;

	}

	public OrderConfirmPage clickConfirm() {
		clickUsingJs(locateElement(Locators.XPATH,"//button[text()='Confirm Order']"));
		return new OrderConfirmPage();
	}

}
