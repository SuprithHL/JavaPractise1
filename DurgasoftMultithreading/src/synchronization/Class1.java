package synchronization;

public class Class1 
{
	public void love(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Srikanth love:");
	        try
	        {
	        	Thread.sleep(2000);
	        }
	        catch(InterruptedException e)
	        {
	        }
	        System.out.println(name);
		}
	}
}
