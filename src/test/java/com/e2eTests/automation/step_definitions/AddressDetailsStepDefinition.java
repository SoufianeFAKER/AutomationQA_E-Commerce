package com.e2eTests.automation.step_definitions;

import java.util.List;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.AddressDetailsPage;

import io.cucumber.java.en.When;

public class AddressDetailsStepDefinition {

	// public RegisterUserStepDefinition registerUserStepDefinition = new
	// RegisterUserStepDefinition();

	public AddressDetailsPage addressDetailsPage = new AddressDetailsPage();

	@When("User verify that the delivery address is same address filled at the time registration of account")
	public void userVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {

		List<String> deliveryAddressExpected = RegisterUserStepDefinition.myAddressInfo;

		List<String> deliveryAddressActual = addressDetailsPage.getDelivryAddress();

		Assert.assertEquals("Mr. " + deliveryAddressExpected.get(0), deliveryAddressActual.get(0));
		Assert.assertEquals(deliveryAddressExpected.get(1), deliveryAddressActual.get(1));
		Assert.assertEquals(deliveryAddressExpected.get(2), deliveryAddressActual.get(2));
		Assert.assertEquals(deliveryAddressExpected.get(3), deliveryAddressActual.get(3));
		Assert.assertEquals(deliveryAddressExpected.get(4) + " " + deliveryAddressExpected.get(5) + " "
				+ deliveryAddressExpected.get(6), deliveryAddressActual.get(4));
		Assert.assertEquals(deliveryAddressExpected.get(8), deliveryAddressActual.get(5));
		Assert.assertEquals(deliveryAddressExpected.get(7), deliveryAddressActual.get(6));

	}

	@When("User verify that the billing address is same address filled at the time registration of account")
	public void userVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {

		List<String> billingAddressExpected = RegisterUserStepDefinition.myAddressInfo;

		List<String> billingAddressActual = addressDetailsPage.getDelivryAddress();

		Assert.assertEquals("Mr. " + billingAddressExpected.get(0), billingAddressActual.get(0));
		Assert.assertEquals(billingAddressExpected.get(1), billingAddressActual.get(1));
		Assert.assertEquals(billingAddressExpected.get(2), billingAddressActual.get(2));
		Assert.assertEquals(billingAddressExpected.get(3), billingAddressActual.get(3));
		Assert.assertEquals(billingAddressExpected.get(4) + " " + billingAddressExpected.get(5) + " "
				+ billingAddressExpected.get(6), billingAddressActual.get(4));
		Assert.assertEquals(billingAddressExpected.get(8), billingAddressActual.get(5));
		Assert.assertEquals(billingAddressExpected.get(7), billingAddressActual.get(6));

	}

}
