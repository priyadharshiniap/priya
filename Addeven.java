import java.util.*;
import java.lang.*;
import java.io.*;
class Addeven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		if(c%2==0)
		{
	        System.out.println("even");
		}
		else
		{
	        System.out.println("odd");
		}
	}
}
