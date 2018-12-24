import java.util.*;
import java.lang.*;
public class Factor
{
	public static void main(String args[])
	{
		int a,count=0,i,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=a%10;
		for(i=1;i<=a;i++)
		{
		    if(a%i==0)
		    {
		        System.out.print(i+" ");
		    }
		}
	}
}
