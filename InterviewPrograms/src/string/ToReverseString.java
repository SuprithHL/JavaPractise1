package string;

import java.util.Scanner;

public class ToReverseString
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char []x=s.toCharArray();
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]);
		}	
	}
}
