import java.util.*;
public class Kodd
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int i,j=0;
	    int a[]=new int[n];
	    int b[]=new int[n];
	    for (i = 0; i < n; ++i) 
        {
            a[i]=sc.nextInt();
        }
	    for (i = 0; i < n; ++i) 
        {
            if((a[i]%2)==1)
            {
                b[j]=a[i];
                j++;
            }
        }
            System.out.print(b[k-1]);
	}
}
