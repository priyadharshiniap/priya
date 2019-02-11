import java.util.*;
import java.lang.*;
import java.io.*;
class Index
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]=new int[100];
		int n;
		Scanner sc=new Scanner(System.in);
    		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		  	System.out.println(a[j]+" "+j);	
		}
    		System.out.println();
		sc.close();
	}
}
