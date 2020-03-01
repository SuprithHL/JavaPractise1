package numbers;

public class SWapping2NumbersUsing3rdVariable 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int temp=0;
		System.out.printf("Before swapping:\na=%d  b=%d\n",a,b);
		temp=a;
		a=b;
		b=temp;
		System.out.printf("After swapping:\na=%d  b=%d\n",a,b);	
	}

}
