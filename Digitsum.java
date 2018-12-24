import java.util.*;
import java.lang.*;
public class Digitsum
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int i,j=0;
	    int a=sc.nextInt();
	    double b=Math.log10(a);
	    int c=((int) b)+1;
	    int e[]=new int[c];
	    for(i=0;i<c;i++)
	    {
	        e[i]=a%10;
	        a=a/10;
	        j=j+e[i];
	    }
	    System.out.print(j);
	}
}
