package deadlock;

public class B
{
	public void d2(A a)
	{
		System.out.println("Thread-2 starts execution d2() method");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		a.last();
	}
	public void last()
	{
		System.out.println("Inside B,last() method");
	}
}
