package zi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();

		Thread.sleep(5000);
		
		/*
		 * List<WebElement> birthMonth =
		 * driver.findElements(By.xpath("//select[@id='month']//option"));
		 * System.out.println(birthMonth.size());
		 * 
		 * String month = "Sep"; for(int i=0;i<=birthMonth.size();i++) {
		 * if(birthMonth.get(i).getText().equalsIgnoreCase(month)) {
		 * birthMonth.get(i).click();
		 * System.out.println(birthMonth.get(i).isDisplayed()); }
		 * 
		 * }
		 */
		  
		  WebElement birthMonth1 = driver.findElement(By.xpath("//select[@id='month']"));
		  Select month1 = new Select(birthMonth1);
		  
		  //month1.selectByVisibleText("Jan");
		  
		  //month1.selectByValue("10");
		  month1.selectByIndex(6);
		 
		  System.out.println(month1.getFirstSelectedOption().getText());

}
}
