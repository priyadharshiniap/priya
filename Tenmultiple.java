import java.util.*;
import java.lang.*;
public class Tenmultiple
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=a%10;
		if(b==0)
		{
		    System.out.println(a);
		}
		else
		{
		    c=10-b;
		    a=a+c;
		    System.out.println(a);
		}
	}
}
