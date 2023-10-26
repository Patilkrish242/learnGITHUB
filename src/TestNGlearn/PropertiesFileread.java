package TestNGlearn;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class PropertiesFileread {

		static WebDriver driver;
		File file=new File("C:\\Users\\KRISHNA\\workspace\\TestNGbasic\\src\\resources\\config.properties");
		Properties prop=new Properties();
		FileInputStream fis;
		@Test
		public void readProp() throws IOException, InterruptedException {
			
			fis=new FileInputStream(file);
			
			prop.load(fis);
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get(prop.getProperty("URL"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		}
	}

