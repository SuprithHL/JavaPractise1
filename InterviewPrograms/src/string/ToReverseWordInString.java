package string;

import java.util.Scanner;

public class ToReverseWordInString 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String words[]=s.split(" ");
		String reverse="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			reverse=reverse+revword+" ";
		}
		System.out.println(reverse);	
	}
}
