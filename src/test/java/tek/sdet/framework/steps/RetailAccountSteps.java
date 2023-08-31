package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
		logger.info("user updated Name and Phone values ");
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		waitTillPresence(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}
	@When("User click on  Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("user clicked on Add address option");
	}
	@When("User fill new address form with below information")
	public void userFllNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		selectByVisibleText(factory.accountPage().country,DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		sendText(factory.accountPage().fullNameField,DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		sendText(factory.accountPage().phoneNumberField,DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		sendText(factory.accountPage().cityField,DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		selectByVisibleText(factory.accountPage().stateDropDown,DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		sendText(factory.accountPage().zipCodeField,DataGeneratorUtility.data(addressInfo.get(0).get(7)));
		logger.info("user filled the new address form with information provided in data table");
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressButton);
		logger.info("user clicked on Add your Address button");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
		Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());
	
	}
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editYourAddresses);
		logger.info("user clicked on Edit Address button");
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInfo(DataTable dataTable) {
		List<List<String>> addressEditedInfo = dataTable.asLists(String.class);
		clearTextUsingSendKeys(factory.accountPage().country);
		clearTextUsingSendKeys(factory.accountPage().fullNameField);
		clearTextUsingSendKeys(factory.accountPage().phoneNumberField);
		clearTextUsingSendKeys(factory.accountPage().streetAddressField);
		clearTextUsingSendKeys(factory.accountPage().apartmentNumber);
		clearTextUsingSendKeys(factory.accountPage().cityField);
		clearTextUsingSendKeys(factory.accountPage().stateDropDown);
		clearTextUsingSendKeys(factory.accountPage().zipCodeField);
		selectByVisibleText(factory.accountPage().country,DataGeneratorUtility.data(addressEditedInfo.get(0).get(0)));
		sendText(factory.accountPage().fullNameField,DataGeneratorUtility.data(addressEditedInfo.get(0).get(1)));
		sendText(factory.accountPage().phoneNumberField,DataGeneratorUtility.data(addressEditedInfo.get(0).get(2)));
		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressEditedInfo.get(0).get(3)));
		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressEditedInfo.get(0).get(4)));
		sendText(factory.accountPage().cityField,DataGeneratorUtility.data(addressEditedInfo.get(0).get(5)));
		selectByVisibleText(factory.accountPage().stateDropDown,DataGeneratorUtility.data(addressEditedInfo.get(0).get(6)));
		sendText(factory.accountPage().zipCodeField,DataGeneratorUtility.data(addressEditedInfo.get(0).get(7)));
		logger.info("user Edited the new address form with information");
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateYourAddressButton);
		logger.info("user clicked on Add your Address button");
	}
	@When("a address updated message should be displayed {string}")
	public void aUpdatedMessageShouldBeDisplayed(String UpdateexpectedMessage) {
		waitTillPresence(factory.accountPage().addressUpdatedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedSuccessfullyMessage));
	}
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().yourAddressRemove);
	}
	@When("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		waitTillPresence(factory.accountPage().addAddressOption);
		Assert.assertTrue(factory.accountPage().addAddressOption.isDisplayed());
		
	}
	@When("User click on Add a payment method link")
	public void userClickOnAddPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodLink);
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> paymentMethodInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberField, DataGeneratorUtility.data(paymentMethodInfo.get(0).get("cartNumber")));
		sendText(factory.accountPage().nameOnCardField, DataGeneratorUtility.data(paymentMethodInfo.get(0).get("nameOnCard")));
		selectByVisibleText(factory.accountPage().expirationDateMonth, paymentMethodInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationDateYear, paymentMethodInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCode, DataGeneratorUtility.data(paymentMethodInfo.get(0).get("securityCode")));
		logger.info("User filled out credit card info");
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardButton);
	}
	@When("a Payment message should be displayed {string}")
	public void aMessageShouldBeDisplayedPaymentAddedSuccessfully(String PaymentExpectedMessage) {
		waitTillPresence(factory.accountPage().addPaymentSuccessfullyMessage);
		Assert.assertTrue(PaymentExpectedMessage, factory.accountPage().addPaymentSuccessfullyMessage.isDisplayed());
	}
	@When("User click on Master Card")
	public void userClickOnMasterCard() {
		waitTillPresence(factory.accountPage().masterCard);
		click(factory.accountPage().masterCard);
}
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		waitTillPresence(factory.accountPage().EditMasterCard);
		click(factory.accountPage().EditMasterCard);
	}
	@When("user edit information with below data")
	public void userEditInfoWithBelowData(DataTable dataTable) {
		List<Map<String, String>> editPaymentMethod = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberUpdate);
		sendText(factory.accountPage().cardNumberField, DataGeneratorUtility.data(editPaymentMethod.get(0).get("cartNumber")));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardUpdate);
		sendText(factory.accountPage().nameOnCardField, DataGeneratorUtility.data(editPaymentMethod.get(0).get("nameOnCard")));
//		clearTextUsingSendKeys(factory.accountPage().expireMonthUpdate);
//		selectByVisibleText(factory.accountPage().expireMonthUpdate, editPaymentMethod.get(0).get("expirationMonth"));
//		clearTextUsingSendKeys(factory.accountPage().expireYearUpdate);
//		selectByVisibleText(factory.accountPage().expireYearUpdate, editPaymentMethod.get(0).get("expirationYear"));
	    clearTextUsingSendKeys(factory.accountPage().securityCodeUpdate);
		sendText(factory.accountPage().securityCodeUpdate, DataGeneratorUtility.data(editPaymentMethod.get(0).get("securityCode")));
		logger.info("User filled out credit card info");
}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCard);
	}
	@When("a update message should be displayed {string}")
	public void aUpdateMessageShouldBeDisplayed(String updateExpectedMessage) {
		waitTillPresence(factory.accountPage().paymentUpdateSuccessfullyMessage);
		Assert.assertTrue(updateExpectedMessage, factory.accountPage().paymentUpdateSuccessfullyMessage.isDisplayed());
	
	}
	@When("User click on Master Card to remove")
	public void userClickOnMasterCardToRemove() {
		click(factory.accountPage().masterCard);
    }
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().masterCardRemove);
	}
	@When("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		waitTillPresence(factory.accountPage().addPaymentMethodLink);
		Assert.assertTrue(factory.accountPage().addPaymentMethodLink.isDisplayed());
	}
}