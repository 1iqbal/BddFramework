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

}
