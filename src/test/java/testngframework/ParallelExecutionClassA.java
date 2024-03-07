package testngframework;

import org.testng.annotations.Test;

public class ParallelExecutionClassA{
@Test
private void tc03()
{
	System.out.println("Tc03");
	System.out.println(Thread.currentThread().getId());
}
@Test
private void tc04()
{
	System.out.println("Tc04");
	System.out.println(Thread.currentThread().getId());
}

}
