package array;

public class MinimumElementInArray 
{
	public static void main(String[] args) 
	{
	   int a[]= {10,34,67,87,6};
	   int min=a[0];
	   for(int i=1;i<a.length;i++)
	   {
		   if(a[i]<min)
		   {
			   min=a[i];
		   }
	   }
	   System.out.println("Minimum element is:"+min);
	}
}
