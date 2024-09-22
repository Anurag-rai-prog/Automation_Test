package ui;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		
		System.out.println(driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value"));
		
		System.out.println(driver.findElement(By.xpath("//input[@name='email']")).getSize().getHeight());
		
		System.out.println(driver.findElement(By.xpath("//input[@name='email']")).getSize().getWidth());
		
		// Explicit wait for an element to be visible
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		
		element.sendKeys("abcd");
		
		// Take a screenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        // Specify the destination file
        File destFile = new File("path/to/screenshot.png");

        // Copy the screenshot to the destination file
        FileUtils.copyFile(srcFile, destFile);

        System.out.println("Screenshot captured and saved to " + destFile.getAbsolutePath());

		
		Thread.sleep(30);
		
		
		

	}

}
