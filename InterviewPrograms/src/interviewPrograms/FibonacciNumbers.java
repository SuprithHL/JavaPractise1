package interviewPrograms;

import java.util.Scanner;

public class FibonacciNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a=sc.nextInt();
	    System.out.println("Enter the 2nd number:");
	    int b=sc.nextInt();
	    System.out.println("Enter the length of series:");
	    int n=sc.nextInt();
	    if(n==0)
	    {
	    	System.exit(0);
	    }
	    if(n==1)
	    {
	    	System.out.println(a);
	    	System.exit(0);
	    }
	    System.out.println(a);
	    System.out.println(b);
	    for(int i=1;i<=n-2;i++)
	    {
	    	int c=a+b;
	    	System.out.println(c);
	    	a=b;
	    	b=c;
	    }
	    sc.close();
	}
}
