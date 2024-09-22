package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zimyo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.zimyo.work/"); 
		
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("anurag.rai@antino.io");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("iys5pjmqjj");
		
		WebElement login = driver.findElement(By.xpath("//button[@id='login']"));
		login.click();
		
		WebElement clockin = driver.findElement(By.xpath("//h6[text()='Clock In']"));
		clockin.click();
		
		Thread.sleep(60000);
		
		WebElement time = driver.findElement(By.xpath("//div[@class='start-flex cts css-1l757zk']//h2"));
		System.out.println(time.getText());
		
		
		String newTime = "00:01";
		if(time.getText().equalsIgnoreCase(newTime)) {
			System.out.println("Clock in successfull");
		} else {
			System.out.println("Unsuccessfull");
		}
		
		

	}

}
