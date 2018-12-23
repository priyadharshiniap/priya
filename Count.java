import java.util.*;
public class Count
{
	public static void main(String[] args)
	{
	    int n,a,count=0;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    while(n!=0)
	    {
	        n=n/10;
	        count=count+1;
	    }
		System.out.println(count);
	}
}
