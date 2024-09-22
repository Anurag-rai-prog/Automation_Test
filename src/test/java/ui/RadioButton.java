package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		Thread.sleep(5000);
		
		/*
		 * //to select radio button
		 * driver.findElement(By.xpath("//input[@value='1']")).click(); //verify that
		 * radio button is enabled
		 * System.out.println(driver.findElement(By.xpath("//input[@value='1']")).
		 * isEnabled());
		 */
		//Thread.sleep(5000);
		
		List<WebElement> radioButton = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("No of radio button" + " "+radioButton.size());
		
		//to select radio button 
		/*
		 * radioButton.get(0).click();
		 * System.out.println(radioButton.get(0).isSelected());
		 * System.out.println(radioButton.get(1).isSelected());
		 */
		 
		
		  String expRadioButton ="Custom"; 
		  for(int i=0;i<radioButton.size();i++) {
		  if(radioButton.get(i).getText().equalsIgnoreCase(expRadioButton)) {
		  radioButton.get(i).click();
		  
		  Thread.sleep(5000);
		  System.out.println("Radio button selected"+" "+radioButton.get(i).isEnabled());
		  break;
		  
		  
		  
		  } }
		 
		driver.close();
}
}

