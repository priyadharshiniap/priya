import java.util.*;
public class Stringcmp
{
	public static void main(String[] args)
	{
	    int n1,n2;
	    String a,b,c;
	    Scanner sc=new Scanner(System.in);
	    a=sc.next();
	    b=sc.next();
	    n1=a.length();
	    n2=b.length();
	    if(n1<n2)
	    {
	        c=b;
	    }
	    else
	    {
	        c=a;
	    }
		System.out.println(c);
	}
}
