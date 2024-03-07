package testngframework;

import org.testng.annotations.Test;

public class ParallelExecutionClassB {
	@Test
	private void tc01()
	{
		System.out.println("Tc01");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc02()
	{
		System.out.println("Tc02");
		System.out.println(Thread.currentThread().getId());
	}

}
