package ui;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Camera");
		
		List<WebElement> searchBox = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		System.out.println(searchBox.size());
		
		String name = "camera stand";
		for(int i=0;i<searchBox.size();i++) {
			System.out.println(searchBox.get(i).getText());
			if(searchBox.get(i).getText().equalsIgnoreCase(name)) {
				searchBox.get(i).click();
				
			}
		}
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
		
		
		
		

	}

}
