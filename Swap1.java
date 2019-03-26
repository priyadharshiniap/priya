import java.util.*;
import java.lang.*;
import java.io.*;
class Swap1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		c=a*b;
		b=c/b;
		a=c/b;
		System.out.println(a+" "+b);
	}
}
