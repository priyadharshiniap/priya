import java.util.*;
public class Sumelements
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int i,count=0;
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        count=count+a[i];
	    }
		System.out.println(count);
	}
}
