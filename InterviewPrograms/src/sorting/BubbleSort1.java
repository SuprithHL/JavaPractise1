package sorting;

import java.util.Scanner;

public class BubbleSort1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the Array:");
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    System.out.println("Enter the elements of the Array");
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
		BubbleSort2 b=new BubbleSort2();
		b.sort(a,n);
		BubbleSort3 b1=new BubbleSort3();
		b1.display(a,n);
		
	}

}
