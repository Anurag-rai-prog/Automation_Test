package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();

		Thread.sleep(5000);
		
		//1st way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println("No of dropdown values "+birthMonth.size());
		birthMonth.get(0).click();
		
		//2nd Way
		WebElement birthMonth1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(birthMonth1);
		
		Thread.sleep(2000);
		
		month.selectByVisibleText("Apr");
		Thread.sleep(2000);
		
		month.selectByValue("10");
		Thread.sleep(2000);
		
		month.selectByIndex(11);
		System.out.println(month.getFirstSelectedOption().getText());
		
		//3rd way
		List<WebElement> dropdown = month.getOptions();
		String monthName = "Sep";
		for(int i=0;i<dropdown.size();i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase(monthName)) {
				dropdown.get(i).click();
				System.out.println("Desired month click");
			}
		}
		
		//4rth way
		birthMonth1.sendKeys("Jul");
		
		//5th Way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");

	}

}
