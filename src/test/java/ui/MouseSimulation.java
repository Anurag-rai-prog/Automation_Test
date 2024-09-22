package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.flipkart.com/");
		
		//web element reference
		
		Thread.sleep(3000);
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Thread.sleep(3000);
		WebElement mobiles = driver.findElement(By.xpath("//span[text()='Mobiles']"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		//mouse hover
		
		act.moveToElement(electronics).build().perform();
		Thread.sleep(3000);
		
		//keyboard simulation
		
		act.sendKeys(mobiles,Keys.ENTER).build().perform();
		Thread.sleep(3000);
		

	}

}
