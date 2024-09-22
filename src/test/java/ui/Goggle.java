package ui;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goggle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/index.html");
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Virat Kohli");
		
		//Thread.sleep(2000);
		
		
		 
		  
		  /*String name = "virat kohli centuries"; 
		  for(WebElement e:searchBox) 
		  {String text=e.getText();
		  text.equals( name);
		  break;
*/
			  
		 
		  
	 List<WebElement> searchBox =driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	  System.out.println(searchBox.size()); //searchBox.get(1).click();
		  
		  //Thread.sleep(2000); 
		  String name = "age"; 
		  for(int i=0;i<searchBox.size();i++) {
		  if(searchBox.get(i).getText().contains(name)) {
		  searchBox.get(i).click();
		  break;
		  } 
	  }
		  
		  Thread.sleep(4000);
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  //js.executeScript("window.scrollBy(300, 500);");
			
			  WebElement cricb1 = driver.findElement(By.
			  xpath("//h3[text()='Virat Kohli Profile - ICC Ranking, Age, Career Info & Stats']")); 
			  js.executeScript("arguments[0].scrollIntoView(true);", cricb1);
			 
		  driver.findElement(By.xpath("//h3[text()='Virat Kohli Profile - ICC Ranking, Age, Career Info & Stats']")).click();
		 
		
		
		

	}

}
