package sorting;

public class SelectionSort1
{
	public static void main(String[] args) 
	{
	    int a[]= {10,8,9,23,7,2};
	    int n=6;
	    SelectionSort2 s2=new SelectionSort2();
	    s2.sort(a,n);
	    SelectionSort3 s3=new SelectionSort3();
	    s3.display(a,n);
	}
}
