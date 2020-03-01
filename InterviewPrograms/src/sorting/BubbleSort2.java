package sorting;

public class BubbleSort2
{
	public void sort(int a[],int n)
	{
		int temp=0;
		for(int i=0;i<=n-2;i++)
		{
			for(int j=0;j<=n-2-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
