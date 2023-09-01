package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
		
		@FindBy(css = "#orderLink")
		public WebElement orderButton;
		
		@FindBy(css = "#cancelBtn")
		public WebElement cancelTheOrder;
		
		@FindBy(css = "#reasonInput")
		public WebElement canselationReasonDropDown;
		
		@FindBy(css = "#orderSubmitBtn")
		public WebElement cancelOrderButton;
		
		@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
		public WebElement cancelationMessage;
		
		@FindBy(css = "#buyAgainBtn")
		public WebElement buyAgainButton;
		
		@FindBy(css = "#placeOrderBtn")
		public WebElement placeYourOrderButton;
		
		@FindBy(css = "#returnBtn")
		public WebElement returnItemButton;
		
		@FindBy(css = "#reasonInput")
		public WebElement returnReasonDropDown;
		
		@FindBy(css = "#dropOffInput")
		public WebElement dropOffReturnPlace;
		
		@FindBy(css = "#orderSubmitBtn")
		public WebElement returnOrderButton;
		
		@FindBy(xpath = "//p[text()='Return was successfull']")
		public WebElement returnSuccessfullMessage;
		
		@FindBy(css = "#reviewBtn")
		public WebElement reviewButton;
	
		@FindBy(css = "input.account__input")
		public WebElement addAHeadlineField;
		
		@FindBy(css = "#descriptionInput")
		public WebElement addAWrittenField;
		
		@FindBy(css = "button.account__btn-submit")
		public WebElement addYourReviewButton;
		
		@FindBy(xpath = "//div[text()='Your review was added successfully']")
		public WebElement addReviewsuccessMessage;
}
