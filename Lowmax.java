import java.util.*;
import java.lang.*;
import java.io.*;
class Lowmax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,min,max;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    min=a[0];
	    max=a[0];
	    for(i=1;i<n;i++)
	    {
	        if(a[i]<min)
	        {
	            min=a[i];
	        }
	    }
	    for(i=1;i<n;i++)
	    {
	        if(a[i]>max)
	        {
	            max=a[i];
	        }
	    }
		System.out.println(min+" "+max);
	}
}
