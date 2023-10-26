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

	public class Hardassertiondemo {

		static WebDriver driver;
		
		@BeforeClass
		public void launch() {
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/");
		//	Assert.fail("forcefully want fail the case");
			String title=driver.getTitle();
			Assert.assertEquals(title, "OrangeHRM");
			Assert.assertNotEquals(title, "orangehrm");
			
		}
		
		@Test
		public void loginApp() {
			WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			Assert.assertTrue(username.isDisplayed());
			username.sendKeys("Admin");
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			Assert.assertTrue(username.isDisplayed());
			Assert.fail("forcefully want fail the case");
			password.sendKeys("admin123");
		}
		
		@Test(dependsOnMethods="loginApp")// use dependsOnMethods only with tag annotation @Test
		public void loginAppbuttonclick() {
			WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
			Assert.assertTrue(login.isEnabled());
			login.click();
		}
		
		@AfterClass
		public void close() {
			driver.quit();
		}
	}

