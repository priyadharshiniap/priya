import java.util.*;
public class Index1
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int i;
	    for (i=0;i<n-1;i++) 
        {
            a[i]=sc.nextInt();
        }
	    for (i=0;i<n-1;i++) 
        {
            if(a[i]>a[i+1])
            {
                System.out.print(i);
                i=n;
            }
        }
	}
}
