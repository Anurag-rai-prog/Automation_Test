package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.findElement(By.xpath("//a[@id='u_0_0_mg']")).click();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Instagram")) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
		
		driver.close();
		
		
		

	}

}
