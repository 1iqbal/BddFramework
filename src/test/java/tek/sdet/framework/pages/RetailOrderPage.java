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
	
}
