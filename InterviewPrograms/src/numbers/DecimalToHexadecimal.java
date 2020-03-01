package numbers;

import java.util.Scanner;

public class DecimalToHexadecimal 
{
	public static void main(String[] args)
	{
		int rem=0;
		String binary="";
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int num=sc.nextInt();
	    int tempnum=num;
	    
	    String a[]= {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
	    while(num>0)
	    {
	    	rem=num%16;
	    	binary=a[rem]+binary;
	    	num=num/16;
	    }
	    System.out.println(binary);
	}

}
