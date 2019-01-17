import java.util.*;
public class Find
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int a[]=new int[n];
	    int i;
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
		System.out.println(a[k-1]);
	}
}
