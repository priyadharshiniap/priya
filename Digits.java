import java.util.*;
import java.lang.*;
import java.io.*;
class Digits
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int i,j;
	    int a=sc.nextInt();
	    double b=Math.log10(a);
	    int c=((int) b)+1;
	    int e[]=new int[c];
	    for(i=c-1;i>=0;i--)
	    {
	        e[i]=a%10;
	        a=a/10;
	    }
	    System.out.print(e[0]);
	    for(j=1;j<c;j++)
	    {
	        System.out.print(" "+e[j]);
	    }
	}
}
