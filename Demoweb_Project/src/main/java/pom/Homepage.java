package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcartLink;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchTextbox;
	
	@FindBy(css = "[value='Search']")
	private WebElement searchButton;
	
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement electronincsLink;
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitaldownloadsLink;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftCardLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchTextbox() {
		return searchTextbox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronincsLink() {
		return electronincsLink;
	}

	public WebElement getApparelLink() {
		return apparelLink;
	}

	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardLink() {
		return giftCardLink;
	}
	
	
	
	
	
	
	

}
