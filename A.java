package deadlock;

public class A
{
	public void d1(B b)
	{
		System.out.println("Thread-1 starts execution of d1() method");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		b.last();
	}
	public void last()
	{
		System.out.println("Inside A,last() method");
	}

}
