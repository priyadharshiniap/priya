import java.util.*;
import java.lang.*;
import java.io.*;
class Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,a,count=0;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    while(n!=0)
	    {
	        n=n/10;
	        count=count+1;
	    }
		System.out.println(count);
	}
}
