package array;

import java.util.Scanner;

public class MaximumElementInArray
{
	static int[] a;
	public static void main(String[] args)
	{
		int a[]= {10,29,15,14,67,89};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum element:"+max);
	}

}
