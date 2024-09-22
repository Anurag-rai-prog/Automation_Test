package zi;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracRadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> radioButton = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println(radioButton.size());
		
		String expRadioButton = "Male";
		for(int i=0;i<=radioButton.size();i++) {
			if(radioButton.get(i).getText().equalsIgnoreCase(expRadioButton)) {
				radioButton.get(i).click();
				System.out.println(radioButton.get(i).isDisplayed());
				System.out.println(radioButton.get(i).isEnabled());
				System.out.println(radioButton.get(i).isSelected());
				
			}
		}
		
		
	}

}
