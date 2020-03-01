package string;

public class ToCheckPalindrome1
{
	public static void main(String[] args) 
	{
	
	    String x="too Hot to HooT";
	    x=x.replace(" ","");
	    char y[]=x.toCharArray();
	    int size=y.length;
	    char a[]=new char[size];
	    int i=0;
	    while(i!=size)
	    {
		    a[i]=y[i];
		    i++;
	    }
	    i=0;
	    while(i!=size)
	    {
		    if(a[i]!=y[i])
		    {
			    System.out.println("Not a palindrome");
			    System.exit(0);
		    }
		    else
		    {
			    i++;
			    continue;
		    }
	    }
	    System.out.println("Palindrome");
	}
}
