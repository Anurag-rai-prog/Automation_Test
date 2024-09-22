package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG6 {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");		
	}
	@Test(priority=1)
	public void verifyTitle() {
		String actualTitle = "Log in to Facebook";
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(true, title);
		System.out.println("Verify1");
		
		Assert.assertEquals(actualTitle, title);
		System.out.println("verify2");
		
		
	}
	@Test(priority=2)
	public void verifyEmailfield() {
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("abcd@gmail.com");
		Assert.assertTrue(email.isDisplayed());
		
	}
	@Test(priority=3)
	public void verifyPasswordfield() {
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("abcd@123");
		Assert.assertTrue(password.isEnabled());
	}
	@Test(priority=4)
	public void verifyLoginbutton() {
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		Assert.assertTrue(loginButton.isDisplayed());
		loginButton.click();
	}
	@Test(priority=5)
	public void verifyError() throws Exception {
		String expecError = "Invalid username or password";
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String actualError = driver.findElement(By.xpath("//div[text()='Invalid username or password']")).getText();
		Assert.assertEquals(expecError,actualError);
	}
	

}
