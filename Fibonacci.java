import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int c=1,d;
		for(int i=0;i<a;i++)
		{
		    d=c+b;
		    System.out.println(c);
		    b=c;
		    c=d;
		}
	}
}
