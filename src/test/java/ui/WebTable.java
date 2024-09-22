package ui;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(2000);
		
		
		  List<WebElement> webtable =driver.findElements(By.xpath("//table[@class='dataTable']//tr//td"));
		  System.out.println(webtable.size());
		  //System.out.println(webtable.get(4).getText());
		  
		  //String comp = "Sai Capital"; 
			for (int i = 0; i < webtable.size(); i++) {
				String comp = "W H Brady & Co.";
				// System.out.println(webtable.get(1).getText());

				if (webtable.get(i).getText().equalsIgnoreCase(comp)) {
					webtable.get(i).click();
					System.out.println("Yes");
					break;
				}
			 
//		  if(webtable.get(i).equals(comp)) {
//			  System.out.println("Yes");
//			  break;
//			  
//		  } else {
//			  System.out.println("No");
//		  }
		
		//driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[4]//td[1]")).click();
		

		  }
	}
}
	
