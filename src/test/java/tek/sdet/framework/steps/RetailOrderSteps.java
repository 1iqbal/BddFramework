package tek.sdet.framework.steps;

import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderButton);
		logger.info("user clicked on order button");
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelTheOrder);
		logger.info("user clicked on cancel the order button");
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancelationReason) {
		Select select = new Select(factory.orderPage().canselationReasonDropDown);
		select.selectByVisibleText(cancelationReason);
		logger.info("user selected the cancelation Reson");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderButton);
		logger.info("user clicked on cancel order button");
	}
	@When("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancelationMessage) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelationMessage));
		logger.info("cancelation message displayed");
	}
	@When("User click on Buy again button")
	public void userClickOnBuyAgainButton() {
		click(factory.orderPage().buyAgainButton);
		logger.info("User clicked on Buy Again");
	}
	@When("User click on place your order")
	public void userClickOnPlaceYourOrder() {
		click(factory.orderPage().placeYourOrderButton);
		logger.info("User clicked on place your order");
	}
	@When("User click on Return Items button")
	public void UserClickOnReturnItemsButton() {
		click(factory.orderPage().returnItemButton);
		logger.info("User clicked on place your order");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String itemDamaged) {
		Select select = new Select(factory.orderPage().returnReasonDropDown);
		select.selectByVisibleText(itemDamaged);
		logger.info("user selected return reason");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String fedExServieces) {
		Select select = new Select(factory.orderPage().dropOffReturnPlace);
		select.selectByVisibleText(fedExServieces);
		logger.info("user selected the drop off service place");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderButton);
		logger.info("user clicked on Return order button");
	}
	@When("a Return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String cancelationMessage) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnSuccessfullMessage));
		logger.info("a Return message displayed");
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("user clicked on Review button");
	}
	@When("User write Review headline {string} and {string}")
	public void userWroteReviewOnHeakline(String headlineValue, String reviewText) {
		sendText(factory.orderPage().addAHeadlineField, headlineValue);
		sendText(factory.orderPage().addAWrittenField, reviewText);
		logger.info("user wrote Review on headline");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addYourReviewButton);
		logger.info("user clicked add your review button");
	}
	@When("a review message should be displayed {string}")
	public void reviewMessageShouldBeDisplayed(String reviewAddedMessage) {
		waitTillPresence(factory.orderPage().addReviewsuccessMessage);
		waitTillClickable(factory.orderPage().addReviewsuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().addReviewsuccessMessage));
	//	Assert.assertEquals(factory.orderPage().addReviewsuccessMessage, reviewAddedMessage);
		logger.info("review message displayed successfully");
	}
	

	
}
