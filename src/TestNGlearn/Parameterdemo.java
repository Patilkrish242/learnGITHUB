package TestNGlearn;

	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Parameterdemo {

		@Test
		@Parameters({"value1","value2"})
		public void calculation(int i, int j) {
			System.out.println(i*j);
			System.out.println(i+" "+j);
		}
	}

