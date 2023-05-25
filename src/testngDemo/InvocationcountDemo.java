package testngDemo;

import org.testng.annotations.Test;

public class InvocationcountDemo {
	@Test(invocationCount = 10)
	void test()
	{
		System.out.println("selenium");
	}

}
