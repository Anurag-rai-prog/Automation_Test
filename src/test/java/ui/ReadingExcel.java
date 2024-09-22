package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//specifying the loation
		File src = new File("C:\\Users\\AnuragExternal\\eclipse-workspace\\SelenuimTesting\\Excel\\Test Sheet.xlsx");
        
		//load file
		FileInputStream workBook = new FileInputStream(src);
		
		//load workbbok
		XSSFWorkbook wb = new XSSFWorkbook(workBook);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		
		System.out.println(sheet.getRow(3).getCell(0).getNumericCellValue());
		
		double cellValue = sheet.getRow(3).getCell(0).getNumericCellValue();
		
		System.out.println((int)cellValue);
		
		//total number of rows
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		//total number of columns
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		
         WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		
		String email = sheet.getRow(1).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		
		
	}

}
