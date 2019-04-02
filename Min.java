import java.util.*;
import java.lang.*;
import java.io.*;

class Min
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]=new int[10];
		int min=0,k;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(k=0;k<10;k++)
		{
		    min=a[k];
		    for(int j=1;j<10;j++)
		    {
			    if(min>a[j])
			    {
				    min=a[j];
			    }
				
		    }
	    }
	    System.out.println(min);
	}
}
