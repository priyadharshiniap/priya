import java.util.*;
import java.lang.*;
public class Binary
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int i,j,count=0;
	    int a=sc.nextInt();
	    double b=Math.log10(a);
	    int c=((int) b)+1;
	    int e[]=new int[c];
	    for(i=0;i<c;i++)
	    {
	        e[i]=a%10;
	        a=a/10;
	        if(e[i]==0||e[i]==1)
	        {
	            
	        }
	        else
	        {
	            count=count+1;
	        }
	    }
	    if(count==0)
	    {
	        System.out.print("yes");
	    }
	    else
	    {
	        System.out.print("no");
	    }
	}
}
