package TestNGlearn;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class LaunchApplicationtestng {

		static WebDriver driver;
		@Test(priority=1)
		public void launchApplication() {
			
			driver =new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			String expected="Facebook – log in or sign up";
			String actualResult=driver.getTitle();
			
			Assert.assertEquals(actualResult, expected);
			
		}
		
		@Test(priority=2)
		public void close() throws InterruptedException {
			Thread.sleep(3000);
			driver.close();
			Reporter.log("close",true);
		}
	}


