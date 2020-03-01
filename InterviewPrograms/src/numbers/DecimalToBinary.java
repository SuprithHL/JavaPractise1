package numbers;

import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args)
	{
		int rem=0;
		String binary="";
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int num=sc.nextInt();
	    int tempnum=num;
	    
	    while(num!=0)
	    {
	    	rem=num%2;
	    	binary=rem+binary;
	    	num=num/2;
	    }
	    System.out.println("The binary format of "+tempnum+" is "+binary);
	}
}
