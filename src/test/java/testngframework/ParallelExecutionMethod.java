package testngframework;

import org.testng.annotations.Test;

public class ParallelExecutionMethod {
@Test
private void tc01()
{
	System.out.println("Anand");
	System.out.println(Thread.currentThread().getId());
}
@Test(priority=-2)
private void tc02()
{
	System.out.println("Ajay");
	System.out.println(Thread.currentThread().getId());
}
@Test
private void tc03()
{
	System.out.println("Muthu");
	System.out.println(Thread.currentThread().getId());
}
@Test
private void tc04()
{
	System.out.println("Akshya");
	System.out.println(Thread.currentThread().getId());
}
@Test
private void tc05()
{
	System.out.println("Bhuvi");
	System.out.println(Thread.currentThread().getId());
}
}
