package QuickStart.QuickStart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {
	@Test
	public void add() {
		
		int a,b;
		a=2;
		b=3;
		Assert.assertEquals(a+b, 5);
	}

}
