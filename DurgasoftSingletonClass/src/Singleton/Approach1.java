package Singleton;

public class Approach1 
{
	private static Approach1 a=new Approach1();
	private Approach1()
	{
		System.out.println("This is the constructor of Approach1 class");
	}
	public static Approach1 getApproach1()
	{
		return a;
	}

}
