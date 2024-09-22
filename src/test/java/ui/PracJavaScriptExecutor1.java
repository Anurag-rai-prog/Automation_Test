package ui;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class PracJavaScriptExecutor1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		  js.executeScript("window.scrollBy(0, 500);");
		
		
	
		
		
		
		
		

	}

}
