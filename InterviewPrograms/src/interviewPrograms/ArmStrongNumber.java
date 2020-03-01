package interviewPrograms;

import java.util.Scanner;

public class ArmStrongNumber
{
	public static void main(String[] args)
	{
		
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number:");
	     int n=sc.nextInt();
	     int n1=n,n2=n;
	     int rem,sum=0,len=0;
	     while(n1>0)
	     {
		    n1=n1/10;
		    len=len+1;
	     }
	     while(n2!=0)
	     {
	    	 int mul=1;
	         rem=n2%10;
	         for(int i=1;i<=len;i++)
	         {
	    	     mul=mul*rem;
	         }
	         sum=sum+mul;
	         n2=n2/10;
	     }
	     if(sum==n)
	     {
	    	 System.out.println(n+" is an Arm Strong Number");
	     }
	     else
	     {
	    	 System.out.println(n+" is not an Arm Strong Number");
	     }
	}

}
