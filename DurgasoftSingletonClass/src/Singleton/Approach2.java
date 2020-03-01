package Singleton;

public class Approach2 
{
	private static Approach2 a=null;
	private Approach2()
	{
		System.out.println("This constructor of Approach2 class");
	}
	public static Approach2 getApproach2()
	{
		if(a==null)
		{
			a=new Approach2(); 
		}
		return a;
	}

}
