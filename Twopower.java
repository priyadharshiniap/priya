import java.util.*;
import java.lang.*;
import java.io.*;
class Twopower
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c=0,d=1;
	    Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
	    while(a>2)
	    {
	        b=a%2;
	        a=a/2;
	        c=c+b;
	    }
	    if(c==0)
	    {
	        System.out.println("yes");
	    }
	    else
	    {
	        System.out.println("no");
	    }
	}
}
