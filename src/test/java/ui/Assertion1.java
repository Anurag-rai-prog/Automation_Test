package ui;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertion1 {
	
WebDriver driver;
	
	@BeforeClass
	public void setBrowserEnvironment() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		
	}
	@Test
	public void validateTextonLandingPage() {
		String expectedText="Log in to Facebook";
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Log')]")).isDisplayed());
		Assert.assertFalse(driver.findElement(By.xpath("//div[contains(text(),'Log')]")).isSelected());
		/*
		 * String actualText =
		 * driver.findElement(By.xpath("//div[contains(text(),'Log')]")).getText();
		 * Assert.assertEquals(actualText,expectedText);
		 */
		System.out.println("True");
	
	}
	@AfterClass
	public void closeWindow() {
		driver.close();
	}
	

}
