package ui;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoggerTest {
	
	public static Logger Log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log = LogManager.getLogger(LoggerTest.class);
		
        WebDriver driver = new ChromeDriver();
        Log.info("Chrome launched");
		
		driver.manage().window().maximize();
		Log.info("Maximize window");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 Log.info("Implicit wait");
		 
		driver.get("https://www.facebook.com/login/");
		Log.info("url is navigated");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		Log.info("email entered");
		
		
		// Explicit wait for an element to be visible
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		
		element.sendKeys("abcd");
		Log.info("Password entered");
		
		
		

	}

}
