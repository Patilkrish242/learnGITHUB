package TestNGlearn;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class SoftAseertiondemo {
	static WebDriver driver;
		SoftAssert sa;
		@BeforeClass
		public void launch() {
			
			driver=new ChromeDriver();
			sa=new SoftAssert();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			String title=driver.getTitle();
			sa.assertEquals(title, "OrangeHRM");
			sa.assertNotEquals(title, "orangehrm");
			
		}
		
		@Test
		public void loginApp() {
			WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			sa.assertTrue(username.isDisplayed());
			username.sendKeys("Admin");
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			sa.assertTrue(username.isDisplayed());
			sa.fail("forcefully want fail the case");
			password.sendKeys("admin123");
		}
		
		@Test
		public void loginAppbuttonclick() {
			WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
			sa.assertTrue(login.isEnabled());
			login.click();
		}
		
		@AfterClass
		public void close() {
			sa.assertAll();
			driver.quit();
		}
	}

