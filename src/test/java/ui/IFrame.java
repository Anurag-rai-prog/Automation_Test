package ui;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(allFrames);
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[@title='Close']")).click();
		
		// driver.switchTo().defaultContent(); switch from child to parent
		
		//for(int i=0;i<allFrames;i++) {
			//driver.switchTo().frame(driver.findElement(By.id("oauth-iframe")));
			//driver.findElement(By.xpath("//a[contains(@href,'tab=privacy')][@target='blank']")).click();
		
WebElement firstframe=driver.findElement(By.xpath("//iframe[contains(@src,'/v1/api/login?isIframe=true&theme=paytm-web')]"));
		
		driver.switchTo().frame(firstframe);
		
		Thread.sleep(2000);
		WebElement secondframe=driver.findElement(By.id("oauth-iframe"));
		
		driver.switchTo().frame(secondframe);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("privacy policy")).click();
		
		
		  // Thread.sleep(2000); // driver.close();
		  
		  Set<String> allWindowsID = driver.getWindowHandles(); //
		  System.out.println(allWindowsID);
		  
	  Iterator<String> windowID = allWindowsID.iterator();
	  
	  String win1 = windowID.next(); 
	  String win2 = windowID.next(); // // 
		  
		  Thread.sleep(2000);
		  
		  driver.switchTo().window(win2); //
		  System.out.println(driver.getTitle());
		  driver.close();
		  //Thread.sleep(2000);
		 		
		//driver.switchTo().defaultContent();
		//driver.switchTo().defaultContent();
		  
		  driver.switchTo().window(win1);
		  System.out.println(driver.getTitle());
		  Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		
		
		
		
		
		
		
		}

	}

