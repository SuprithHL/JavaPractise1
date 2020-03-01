package string;

public class CopyStringToAnotherString
{
	public static void main(String[] args) 
	{
		String x="ABC tech";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size)
		{
			a[i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(a);
	}
}
