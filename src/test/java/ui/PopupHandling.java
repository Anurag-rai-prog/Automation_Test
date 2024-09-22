package ui;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoqa.com/browser-windows");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		 js.executeScript("window.scrollBy(0, 500);");
		 
		 driver.findElement(By.id("tabButton")).click();
		 
		 //get the total number of tabes
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID);
		//[DB2B533448E274F71AF6EADAB3D43609, 3F510254F96455D04AB86B1905D96038]
		
		Iterator<String> windowID = allWindowsID.iterator();
		String win1 = windowID.next();//1st window
		String win2 = windowID.next();//2nd window
		
		//print title of the parent tab
		driver.switchTo().window(win1);
		System.out.println(win1);
		System.out.println(driver.getTitle());
		
		//url of the child tab
		driver.switchTo().window(win2);
		System.out.println(win2);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
