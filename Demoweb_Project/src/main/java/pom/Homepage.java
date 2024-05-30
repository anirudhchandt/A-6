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
	
	
	
	
	

}
