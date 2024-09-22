package pageSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "email")
	WebElement emailField;
	
	@FindBy(id = "pass")
	WebElement passwordField;
	
	@FindBy(name = "login")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	WebElement createNewAccountButton;
	
	public FacebookLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		emailField.sendKeys(password);
	
	}	
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isEmailFieldDisplayed() {
		return emailField.isDisplayed();
	}
	
	public boolean isPasswordFieldDisplayed() {
		return passwordField.isDisplayed();
	}
	
	public boolean isLoginButtonDisplayed() {
		return loginButton.isDisplayed();
	}
	
	public boolean isCreateNewAccountButtonDisplayed() {
		return createNewAccountButton.isDisplayed();
	}

}
