package TestNGlearn;

	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Thirdtestng {

		@BeforeTest
		public void beforeTest() {
			Reporter.log("before Test- Test-2",true);
		}

		@AfterTest
		public void afterTest() {
			Reporter.log("After Test- Test-2",true);
		}
		@BeforeClass
		public void beforeClass() {
			Reporter.log("before class- Third",true);
		}
		
		@AfterClass
		public void afterClass() {
			Reporter.log("after class-Third",true);
		}
		
		@BeforeMethod
		public void msgThird() {
			Reporter.log("before mothod third",true);
		}
		
		@AfterMethod
		public void msg1Third() {
			Reporter.log("after mothod third",true);
		}
		@Test
		public void login_application_doctor() {
			//System.out.println("login done");// only we can see print msg on console
			
			Reporter.log("login successfully doctor",true);
		}
		
		@Test
		public void profileEditDoctor() {
			Reporter.log("profile able edit for doctor",true);
		}
	}

