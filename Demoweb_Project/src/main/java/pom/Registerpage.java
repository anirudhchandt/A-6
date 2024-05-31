package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {

	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gender-male")
	private WebElement genderRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstnameTextbox;
	
	@FindBy(id = "LastName")
	private WebElement lastnameTextbox;
	
	@FindBy(id = "Email")
	private WebElement emailTextbox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextbox;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswordTextbox;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public WebElement getFirstnameTextbox() {
		return firstnameTextbox;
	}

	public WebElement getLastnameTextbox() {
		return lastnameTextbox;
	}

	public WebElement getEmailTextbox() {
		return emailTextbox;
	}

	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}

	public WebElement getConfirmpasswordTextbox() {
		return confirmpasswordTextbox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	

}
