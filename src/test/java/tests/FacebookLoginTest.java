package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageSetup.FacebookLoginPage;
import utils.BaseTest;

public class FacebookLoginTest extends BaseTest{
	
	@Test
	public void testURLValidations() {
		String expectedURL = "https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertEquals(actualURL, expectedURL, "URL Validation Failed");
	}
	
	@Test
	public void testTitleValidation() {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		String expectedTitle = "Log in to Facebook";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title Validation Failed");
		
	}
	
	@Test
	public void testInputFieldValidation() {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		Assert.assertTrue(loginPage.isEmailFieldDisplayed(), "Email input field is not displayed");
		Assert.assertTrue(loginPage.isPasswordFieldDisplayed(), "Password input field is not displayed");
	}
	
	@Test
	public void testLoginButtonValidation() {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		Assert.assertTrue(loginPage.isLoginButtonDisplayed(), "Login button is not displayed");
	}
	
	@Test
	public void testCreateNewAccountButtonValidation() {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		Assert.assertTrue(loginPage.isCreateNewAccountButtonDisplayed(),"Create new button not displayed");
	}
	
	

}
