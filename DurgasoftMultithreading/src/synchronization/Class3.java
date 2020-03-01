package synchronization;

public class Class3 extends Thread
{
	Class1 c1;
	String name;
	Class3(Class1 c1,String name)
	{
		this.c1=c1;
		this.name=name;
	}
	public void run()
	{
		c1.love(name);
	}
}
