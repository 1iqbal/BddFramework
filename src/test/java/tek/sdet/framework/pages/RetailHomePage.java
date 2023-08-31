package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	
	@FindBy(xpath ="//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlug;
	
	@FindBy(xpath ="//select[@class='product__select']/option[2]")
	public WebElement kasaOSPqty;
	
	@FindBy(xpath ="//button[@class='product__btn']//child::span")
	public WebElement addToCart;
	
	@FindBy(xpath = "//span[@class='top-nav__cart-quantity']")
	public WebElement cartQtyAssertion;
	
	@FindBy(css = "#cartBtn")
	public WebElement cartOption;
	
	@FindBy(xpath = "//span[@class='cart__item-delete']")
	public WebElement deleteItemOnCart;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement qtyField;
	
	@FindBy(css = "#proceedBtn")
	public WebElement proceedToChechout;
	
	@FindBy(css = "#addAddressBtn")
	public WebElement addANewAddressLinkOnCart;
	
	@FindBy(css = "#addPaymentBtn")
	public WebElement addANewCreditOrDebitCard;
	
	@FindBy(css="#placeOrderBtn")
	public WebElement placeYourOrder;
    
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedThanks;
	
//	@FindBy(xpath = "//option[text()='Electronics']")
//	public WebElement electronics;
	
	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendsProducts;
}
