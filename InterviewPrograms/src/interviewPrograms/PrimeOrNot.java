package interviewPrograms;

import java.util.Scanner;

public class PrimeOrNot
{
	public static void main(String[] args) 
	{
		
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number to check");
	     int n=sc.nextInt();
	     int temp=0;
 	     
	     for(int i=2;i<=n/2+1;i++)
	     {
		      if(n%i==0)
		      {
			     temp+=1;
		      }
	     }
	     if(temp>0)
	     {
		     System.out.println(n+" is not a prime number");
	     }
	     else
	     {
		     System.out.println(n+" is a prime number");
	     }
	     sc.close();
	}
	
}
