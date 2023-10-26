package Basictestng;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class basic {
	
	@Test
	public void m1()
	{
	System.out.println("Basic of testNG");//this statement will give output in console only
	//but in the testNG report we dont get any output
	Reporter.log("Testng Reporter",true);//It will give output in console as well as in testng report
	//But the condition is, it should be true
	//If it is false then we get output only in tesng report
	}

}
