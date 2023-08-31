package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	// create object Retailapage
	// creat

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);

	}

	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product " + productValue);
	}

	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
		logger.info("the Product is displayed on home page");

	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allIcon);
		logger.info("user clicked on All section");

	}

	@Then("below options are present in shop by department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);

		List<WebElement> actualSideBar = factory.homePage().sideBarElements;

		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText() + " is equal to " + expectedSideBar.get(0).get(i));
		}
//		Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
//		logger.info("actual is equal to expected");

	}

	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + " is present ");
				} catch (StaleElementReferenceException e) {

				}
				break;
			}
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;

		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present ");
				}
			}

		}

//	}
//	
//	@When("User click on Sign in option")
//	public void userClickOnSignInOption() {
//		click(factory.homePage().signInButton);
//	}
//	@When("User enter email {string} and password {string}")
//	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
//		sendText(factory.signInPage().emailField, emailValue);
//		logger.info("Email was sent successfully");
//		sendText(factory.signInPage().passwordField, passwordValue);
//		logger.info("Password was sent successfully");
//	}
//	@When("User click on login button")
//	public void userClickOnLoginButton() {
//		click(factory.signInPage().loginPageButton);
//		logger.info("login button was clicked successfully");
//	}
//	@When("User should be logged in into Account")
//	public void userShouldBeLoggedInIntoAccount() {
//		waitTillPresence(factory.homePage().tekSchoolLogo);
//		Assert.assertTrue(factory.homePage().tekSchoolLogo.isDisplayed());
	}
	@When("User change the category to {string}")
	public void userChangeTheCategoryToSmartHome(String smartHomePro) {
		click(factory.homePage().allDepartmentDropDown);
		Select select = new Select(factory.homePage().allDepartmentDropDown);
		select.selectByVisibleText(smartHomePro);
		logger.info("user clicked on all Department");
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String productKasa) {
		sendText(factory.homePage().searchBar, productKasa);
		logger.info("user searched for kasa outdoor smart plug");
	} 
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user clicked on search icon");
	}
	@When("User click on item")
	public void userClickOnItem() throws InterruptedException {
		waitTillClickable(factory.homePage().kasaOutdoorSmartPlug);
		click(factory.homePage().kasaOutdoorSmartPlug);
		logger.info("user clicked on kasa outdoor smart plug");
		Thread.sleep(5000);
		
	}
	@When("User select quantity {string}")
	public void userSelectQuantity(String qty) {
		click(factory.homePage().qtyField);
		Select select = new Select(factory.homePage().qtyField);
		select.selectByVisibleText(qty);
		logger.info("user clicked on QTY field");
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCart);
	}
	@When("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeToTwo(String changedQty) throws InterruptedException {
				Assert.assertEquals(changedQty, factory.homePage().cartQtyAssertion.getText());
				Thread.sleep(5000);
	}
	@When("User click on Cart option")
	public void userClickToCart() {
		waitTillClickable(factory.homePage().cartOption);
		click(factory.homePage().cartOption);
	}
	@When("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		waitTillClickable(factory.homePage().proceedToChechout);
		click(factory.homePage().proceedToChechout);
		logger.info("user clicked on proceed checkout button");
	}
	@When("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() throws InterruptedException {
		waitTillClickable(factory.homePage().addANewAddressLinkOnCart);
		click(factory.homePage().addANewAddressLinkOnCart);
		logger.info("user chicked to Add a new address link for shipping address");
		Thread.sleep(5000);
	}
	@When("User fill new address form with below informations")
	public void userFillNewAddressFormWithBelowInfo(DataTable dataTable) throws InterruptedException {
		List<List<String>> newAddressInfo = dataTable.asLists(String.class);
		selectByVisibleText(factory.accountPage().country, DataGeneratorUtility.data(newAddressInfo.get(0).get(0)));
		sendText(factory.accountPage().fullNameField, DataGeneratorUtility.data(newAddressInfo.get(0).get(1)));
		sendText(factory.accountPage().phoneNumberField, DataGeneratorUtility.data(newAddressInfo.get(0).get(2)));
		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(newAddressInfo.get(0).get(3)));
		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(newAddressInfo.get(0).get(4)));
		sendText(factory.accountPage().cityField, DataGeneratorUtility.data(newAddressInfo.get(0).get(5)));
		selectByVisibleText(factory.accountPage().stateDropDown, DataGeneratorUtility.data(newAddressInfo.get(0).get(6)));
		sendText(factory.accountPage().zipCodeField, DataGeneratorUtility.data(newAddressInfo.get(0).get(7)));
		logger.info("user filled new address form with new Info");
		Thread.sleep(5000);
	}
	@When("User click Add Your Address buttons")
	public void userClickAddYourAddressButton() {
		waitTillPresence(factory.accountPage().addYourAddressButton);
		click(factory.accountPage().addYourAddressButton);
		logger.info("user clicked to add your address button");
	}
	@When("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() throws InterruptedException {
	waitTillPresence(factory.homePage().addANewCreditOrDebitCard);
	click(factory.homePage().addANewCreditOrDebitCard);
	logger.info("user clicked add a credit or Debit Card for Payment method");
	Thread.sleep(3000);
}
	@When("User fill Debit or credit card informations")
	public void userFilledDebitOrCreditCardInfo(DataTable dataTable) throws InterruptedException {
		List<List<String>> paymentMethodInfo = dataTable.asLists(String.class);
		sendText(factory.accountPage().cardNumberField, DataGeneratorUtility.data(paymentMethodInfo.get(0).get(0)));
		sendText(factory.accountPage().nameOnCardField, DataGeneratorUtility.data(paymentMethodInfo.get(0).get(1)));
		click(factory.accountPage().expirationDateYear);
		selectByVisibleText(factory.accountPage().expirationDateYear, DataGeneratorUtility.data(paymentMethodInfo.get(0).get(2)));
		click(factory.accountPage().expirationDateMonth);
		selectByVisibleText(factory.accountPage().expirationDateMonth, DataGeneratorUtility.data(paymentMethodInfo.get(0).get(3)));
		sendText(factory.accountPage().securityCode, DataGeneratorUtility.data(paymentMethodInfo.get(0).get(4)));
		logger.info("user filled Debit or Cridit card Info");
//		Thread.sleep(2000);
	}
	@When("User click on Add your card buttons")
	public void userClickOnAddYourCardButton() {
		waitTillPresence(factory.accountPage().addDebitOrCreditCart);
		click(factory.accountPage().addDebitOrCreditCart);
		logger.info("userClickOnAddYourCardButton");
	}
	@When("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() throws InterruptedException {
		waitTillPresence(factory.homePage().placeYourOrder);
		click(factory.homePage().placeYourOrder);
		Thread.sleep(5000);
	}
	@When("a message should be displayeds {string}")
	public void aMessageShouldBeDisplayed(String thanksMessage) {
	Assert.assertEquals(thanksMessage, factory.homePage().orderPlacedThanks.getText());	
	}
	
	@When("User changing the category to {string}")
	public void userChangingTheCategoryToElec(String Electronics) {
		click(factory.homePage().allDepartmentDropDown);
		Select electronics = new Select(factory.homePage().allDepartmentDropDown);
		electronics.selectByVisibleText(Electronics);
		logger.info("User changed the category to Electronics");
	}
	@When("And User search for an item {string}")
	public void andUserSearchForAnItemApexLegends(String ApexLegends) {
		sendText(factory.homePage().searchBar, ApexLegends);
		logger.info("user searched for Apex Legends Item");
	}
	@When("User click on Search Icon")
	public void userClickOnSearchedIcon() {
		click(factory.homePage().searchButton);
	}
	@When("User click on items")
	public void userClickedOnItem() {
		click(factory.homePage().apexLegendsProducts);
		logger.info("user clicked on Apex Legends");
	}
	@When("User select quantities {string}")
	public void userSelectQuantityItem(String selectApexQty) {
		Select apexQtys = new Select(factory.homePage().qtyField);
		apexQtys.selectByVisibleText(selectApexQty);
		logger.info("user Selected Qty of Apex Legends");
	}
//	@When("User click add to Cart button")
//	public void userClickedAddToCartButton() {
//		click(factory.homePage().addToCart);
//		logger.info("user clicked on add to cart button");
//	}
	@When("the cart icon quantity should changes to {string}")
	public void theCartIconQtyChangedTo(String changedApexQty) {
		waitTillPresence(factory.homePage().cartQtyAssertion);
		Assert.assertEquals(changedApexQty, factory.homePage().cartQtyAssertion.getText());
		
	}
}