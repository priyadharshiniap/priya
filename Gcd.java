import java.util.*;
public class Gcd
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int temp,c,d,i;
	    if(a>b)
	    {
	        temp=b;
	        b=a;
	        a=temp;
	    }
	    for(i=a;i>=1;i--)
	    {
	        c=a%i;
	        d=a/i;
	        if(c==0)
	        {
	            d=b%i;
	            if(d==0)
	            {
	                System.out.println(i);
	                i=0;
	            }
	        }
	    }
	}
}
