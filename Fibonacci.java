import java.util.*;
import java.lang.*;
import java.io.*;
class Fibonacci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		int c=1,d;
		System.out.print(b);
		for(int i=1;i<a;i++)
		{
		    d=c+b;
		    System.out.print(" "+c);
		    b=c;
		    c=d;
		}
	}
}
