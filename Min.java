import java.util.*;
import java.lang.*;
public class Min
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int min=0,n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(k=0;k<n;k++)
		{
		    min=a[k];
		    for(int j=1;j<n;j++)
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
