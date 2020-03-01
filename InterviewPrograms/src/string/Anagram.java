package string;

import java.util.Arrays;

public class Anagram
{
	public static void main(String[] args) 
	{
	    String x="HE Is aRadhya";
	    String y="Is he HRADAYA";
	
	    x=x.replace(" ","");
	    y=y.replace(" ","");
	
	    x=x.toLowerCase();
	    y=y.toLowerCase();
	
	    char a[]=x.toCharArray();
	    char b[]=y.toCharArray();
	
	    Arrays.sort(a);
	    Arrays.sort(b);
	
	    Boolean result=Arrays.equals(a,b);
	
	    if(result==true)
	    {
		    System.out.println("string are anagram");
	    }
	    else
	    {
		    System.out.println("Strings are not anagram");
	    }
	}
}
