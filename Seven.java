import java.util.*;
import java.lang.*;
public class Seven
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=a%7;
		if(b==0)
		{
		    System.out.println("yes");
		}
		else
		{
		    System.out.println("no");
		}
	}
}
