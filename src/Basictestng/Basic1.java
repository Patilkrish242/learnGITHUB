package Basictestng;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic1 {
	
	@Test
	public void m1()
	{
	Reporter.log("M1 method", true);
	}
	@Test
	public void a1()
	{
	Reporter.log("a1 method", true);
	}
	@Test
	public void c1()
	{
	Reporter.log("c1 method", true);
	}
	@Test
	public void z1()
	{
	Reporter.log("z1 method", true);
	}
	
}
