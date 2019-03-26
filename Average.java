import java.util.*;
import java.lang.*;
import java.io.*;
class Average
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,total=0,avg;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	        total=a[i]+total;
	    }
	    avg=total/n;
		System.out.println(avg);
	}
}
