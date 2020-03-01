package numbers;

import java.util.Scanner;

public class FactorialByRecursion
{
	static int fact=1;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		FactorialByRecursion f=new FactorialByRecursion();
		f.factorial(num);
		System.out.println("The factorial of "+temp+" is "+fact);
	}
	void factorial(int num)
	{
		if(num>1)
		{
		    fact=fact*num;
		    num=num-1;
		    factorial(num);
		}
	}

}
