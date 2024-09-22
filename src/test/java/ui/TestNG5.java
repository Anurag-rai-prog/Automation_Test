package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG5 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setBrowserEnvironment() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		
	}
	@DataProvider
	public Object[][] dataSet(){
		Object arr[][] = new Object[3][2];
		
		arr[0][0] = "Username1";
		arr[0][1] = "pasword1";
		
		arr[1][0] = "Username2";
		arr[1][1] = "pasword2";
		
		arr[2][0] = "Username3";
		arr[2][1] = "pasword3";
		
		return arr;
				
	}
	@Test(dataProvider="dataSet")
	public void loginCheck(String username, String password) throws Exception {
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		
	}
	@AfterClass
	public void closeWindow() {
		driver.quit();
	}

}
