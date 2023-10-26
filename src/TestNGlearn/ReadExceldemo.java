package TestNGlearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadExceldemo {

	static WebDriver driver;

	@Test
	public void readExcel() throws IOException, InterruptedException {
		driver = new ChromeDriver();

		// read file
		File file = new File("D:\\selenium file\\ExportExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);

		// to lead your workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // when your excel file
														// extension is .xlsx
		// HSSFWorkbook hb=new HSSFWorkbook(fis);// when your excel file
		// extension is .xls
		XSSFSheet sheet = workbook.getSheet("ExcelReadDemo");
		// Sheet sheet=workbook.getSheetAt(0);

		int rownu = sheet.getLastRowNum();

		String username = "";
		String password = "";
		for (int i = 2; i < rownu; i++) {// 5<5

			username = sheet.getRow(i).getCell(0).getStringCellValue();
			// username=sheet.getRow(i).getCell(0).getNumericCellValue();// if
			// excel cell value is number
			password = sheet.getRow(i).getCell(1).getStringCellValue();
			break;
		}
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

}
