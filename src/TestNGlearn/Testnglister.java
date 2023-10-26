package TestNGlearn;

	
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

	public class Testnglister implements ITestListener{

		@Override
		public void onTestStart(ITestResult result) {
			
			Reporter.log("test case started: "+result.getName(),true);
		}
		
		@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("test case passed: "+result.getName(),true);
		}
		
		@Override
		public void onTestFailure(ITestResult result) {
			Reporter.log("test case failed: "+result.getName(),true);
		}
		
		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			Reporter.log("Test case skipped"+result.getName(),true);
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			Reporter.log("Test case skipped"+result.getName(),true);
			
		}

		@Override
		public void onStart(ITestContext context) {
			
			Reporter.log("On test context start: "+context.getName(),true);
			
		}

		@Override
		public void onFinish(ITestContext context) {
		
			Reporter.log("on test context finish: "+context.getName(),true);
			
		}

	}

