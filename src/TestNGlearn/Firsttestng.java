package TestNGlearn;

	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	public class Firsttestng {

		@BeforeSuite
		public void setup() {
			Reporter.log("before suite- launch browser",true);
		}
		@AfterSuite
		public void close() {
			Reporter.log("after suite- close browser",true);
		}
		
		
		@BeforeClass
		public void beforeClass() {
			Reporter.log("before class- First",true);
		}
		
		@AfterClass
		public void afterClass() {
			Reporter.log("after class-First",true);
		}
		@BeforeMethod
		public void msg() {
			Reporter.log("method execution started",true);
		}
		
		@AfterMethod
		public void msg1() {
			Reporter.log("method execution stopped",true);
		}
		
		@Test(priority=2, enabled=true)
		public void login_application() {
			//System.out.println("login done");// only we can see print msg on console
			
			Reporter.log("login successfully meta data",true);
		}
		
		@Test(priority=1, enabled=true)
		public void profile() {
			Reporter.log("profile able to see",true);
		}
		
		@Test(priority=-3, enabled=true)
		public void applicationFormClickevent() {
			Reporter.log("able to click on the event",true);
		}
	}

