import java.util.*;
public class Swapstring
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int n,i,j,count=0;
	    n=str.length();
	    char ch1[]=new char[n];
	    char ch[]=str.toCharArray();
	    for(i=0;i<n;i++)
	    {
	        if((i%2==0)&&(i!=n-1))
	        {
	            ch1[i+1]=ch[i];
	        }
	        else if((i%2==0)&&(i==n-1))
	        {
	            ch1[i]=ch[i];
	        }
	        else
	        {
	            ch1[i-1]=ch[i];
	        }
	    }
	    for(i=0;i<n;i++)
	    {
	        System.out.print(ch1[i]);
	    }
	   
	}
}
