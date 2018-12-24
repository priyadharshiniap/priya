import java.util.*;
import java.lang.*;
public class Oddnum
{
	public static void main(String[] args)
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
	    for(j=0;j<c;j++)
	    {
	        if(e[j]%2!=0)
	        {
	            System.out.print(e[j]+" ");
	        }
	    }
	}
}
