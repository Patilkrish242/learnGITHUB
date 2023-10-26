package TestNGlearn;
	
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Secondtest {

		@BeforeTest
		public void beforeTest() {
			Reporter.log("before Test- Test-1",true);
		}

		@AfterTest
		public void afterTest() {
			Reporter.log("After Test- Test-1",true);
		}
		@BeforeClass
		public void beforeClass() {
			Reporter.log("before class- Second",true);
		}
		
		@AfterClass
		public void afterClass() {
			Reporter.log("after class-Second",true);
		}
		
		@Test
		public void login_application_patient() {
			//System.out.println("login done");// only we can see print msg on console
			
			Reporter.log("login successfully patient",true);
		}
		
		@Test
		public void profileEdit() {
			Reporter.log("profile able edit",true);
		}
		
		@Test
		public void logout() {
			Reporter.log("logout the application",true);
		}
	}

