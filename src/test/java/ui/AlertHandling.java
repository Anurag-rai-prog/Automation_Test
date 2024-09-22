package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		 js.executeScript("window.scrollBy(0, 500);");
		 
		 driver.findElement(By.id("confirmButton")).click();
		 
		 String alertText = driver.switchTo().alert().getText();
		 System.out.println(alertText);
		 
		 String expText = "Do you confirm action?";
		 
		 if(alertText.equals(expText)) {
			 System.out.println("Alert text is verified");
		 } else {
			 System.out.println("verification failed");
		 }
		 
		 Thread.sleep(2000);
		  
		 //for accept
		 //driver.switchTo().alert().accept();
		 //System.out.println("Alert accepted");
		 
		 //for dismiss
		 driver.switchTo().alert().dismiss();
		 System.out.println("alert dismiss");
		
		
		
		
		
	}

}
