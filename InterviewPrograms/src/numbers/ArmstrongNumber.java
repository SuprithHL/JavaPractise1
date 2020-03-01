package numbers;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
	    int num=sc.nextInt();
	    int num1=num;
	    int len=0;
	    while(num1!=0)
	    {
		    num1=num1/10;
		    len=len+1;
    	}
	    int num2=num;
	    int sum=0;
	    int rem;
	    while(num2!=0)
	    {
	    	int mul=1;
	    	rem=num2%10;
	    	for(int i=1;i<=len;i++)
	    	{
	    		mul=mul*rem;
	    	}
	    	sum=sum+mul;
	    	num2=num2/10;
	    }
	    if(num==sum)
	    {
	    	System.out.println("The given number "+num+" is an Armstrong number");
	    }
	    else
	    {
	    	System.out.println("The given number "+num+" is not an Armstrong number");
	    }
	}
}
