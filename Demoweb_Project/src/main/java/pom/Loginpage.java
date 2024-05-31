package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailTextbox;

	@FindBy(id = "Password")
	private WebElement passwordTextbox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public WebElement getEmailTextbox() {
		return emailTextbox;
	}

	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
