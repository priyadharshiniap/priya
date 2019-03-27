import java.util.*;
import java.lang.*;
import java.io.*;
class Neareven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
	    Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
	    if(a%2==0)
	    {
	      System.out.println(a);
	    }
	    else
	    {
	      System.out.println(a-1);
	    }
	}
}
