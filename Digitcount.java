import java.util.*;
import java.lang.*;
import java.io.*;
class Digitcount
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    int i,j=0;
	    int a=sc.nextInt();
	    double b=Math.log10(a);
	    int c=((int) b)+1;
	    System.out.println(c);
	}
}
