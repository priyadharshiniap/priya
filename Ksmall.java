import java.util.*;
public class Ksmall
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int i,j,b;
	    int a[]=new int[n];
	    for (i = 0; i < n; ++i) 
        {
            a[i]=sc.nextInt();
        }
	    for (i = 0; i < n; ++i) 
        {
            for (j = i + 1; j < n; ++j)
            {
                if (a[i] > a[j]) 
                {
                    b =  a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
            System.out.print(a[k-1]);
	}
}
