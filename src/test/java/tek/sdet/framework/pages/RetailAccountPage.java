package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;

	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;

	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneNumberField;

	@FindBy(css = "#personalUpdateBtn")
	public WebElement profileUpdateButton;
	
	@FindBy(css = "#emailInput")
	public WebElement profileUpdateEmail;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;

	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressOption;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement country;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberField;
	
	@FindBy(id = "streetInput")
	public WebElement streetAddressField;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentNumber;
	
	@FindBy(id = "cityInput")
	public WebElement cityField;
	
	@FindBy(xpath = "(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateDropDown;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeField;
	
	@FindBy(id = "addressBtn")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessage;
	
	@FindBy(xpath = "//p[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	public WebElement addPaymentMethodLink;
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement cardNumberField;
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement nameOnCardField;
	
	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement expirationDateMonth;
	
	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement expirationDateYear;
	
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement securityCode;
	
	@FindBy(xpath = "(//button[@class='account__btn-submit'])[3]")
	public WebElement addYourCardButton;

	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement addPaymentSuccessfullyMessage;
	
	@FindBy(xpath = "(//div[@class='false account__payment-item'])[1]")
	public WebElement masterCard;
	
	@FindBy(xpath = "(//button[contains(@class,'text-blue-800 cursor-pointer hover:underline')])[1]")
	public WebElement EditMasterCard;
	
	@FindBy(css = "#cardNumberInput")
	public WebElement cardNumberUpdate;
	
	@FindBy(css = "#nameOnCardInput")
	public WebElement nameOnCardUpdate;
	
	@FindBy(css = "#expirationMonthInput")
	public WebElement expireMonthUpdate; 
	
	@FindBy(css = "#expirationYearInput")
	public WebElement expireYearUpdate;
	
	@FindBy(css = "#securityCodeInput")
	public WebElement securityCodeUpdate;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentUpdateSuccessfullyMessage;
	
	@FindBy(xpath = "(//button[@class='account__btn-submit'])[3]")
	public WebElement updateYourCard;
	
	@FindBy(xpath = "(//button[@class='text-blue-800 cursor-pointer hover:underline'])[2]")
	public WebElement masterCardRemove;
	
	
	@FindBy(xpath = "(//button[@class='account__address-btn'])[1]")
	public WebElement editYourAddresses;
	
	@FindBy(xpath = "//button[text()='Update Your Address']")
	public WebElement updateYourAddress;
	
	@FindBy(xpath = "//button[text()='Update Your Address']")
	public WebElement updateYourAddressButton;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfullyMessage;
	
	@FindBy(xpath = "(//button[@class='account__address-btn'])[2]")
	public WebElement yourAddressRemove;
	
	@FindBy(xpath = "//button[@class='account__btn-submit']")
	public WebElement addDebitOrCreditCart;
}
