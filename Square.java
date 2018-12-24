import java.util.*;
import java.lang.*;
public class Square
{
	public static void main(String args[])
	{
		int a,c,b,i,count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		for(i=1;i<=c/2;i++)
		{
		    if(i*i==c)
		    {
		        count=0;
		        i=c;
		    }
		    else
		    {
		        count++;
		    }
		}
		if(count==0)
		{
		    System.out.print("yes");
		}
		else
		{
		    System.out.print("no");
		}
	}
}
