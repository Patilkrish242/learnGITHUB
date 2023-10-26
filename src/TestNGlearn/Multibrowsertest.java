package TestNGlearn;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Multibrowsertest {

		static WebDriver driver;
		
		@BeforeSuite
		@Parameters({"browserName","appURL"})
		public void setup(@Optional("edge") String browserName,@Optional("appURL") String appURL) {
			
			switch(browserName) {
			case "chrome":
				driver=new ChromeDriver();
				driver.get(appURL);
				//break;
			case "edge" :
				driver=new EdgeDriver();
				driver.get(appURL);
				//break;
				
			case "firefox" :
				driver=new FirefoxDriver();
				driver.get(appURL);
				//break;
			}
		}
		
		@Test
		public void loginapp() throws InterruptedException {
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		}
	}

