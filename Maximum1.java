import java.util.*;
import java.lang.*;
import java.io.*;
class Maximum1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,max=0;
		for(i=0;i<10;i++)
		{
		    a[i]=sc.nextInt();
		    if(a[i]>max)
		    {
		        max=a[i];
		    }
		}
		System.out.println(max);
	}
}
