import java.util.*;
public class Stringdiffer
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    String b=sc.next();
	    char ch1[]=a.toCharArray();
	    char ch2[]=b.toCharArray();
	    int n1=a.length();
	    int n2=b.length();
	    int count=0,i;
	    if(n1==n2)
	    {
	        for(i=0;i<n1;i++)
	        {
	            if(ch1[i]==ch2[i])
	            {
	                
	            }
	            else
	            {
	                count++;
	            }
	        }
	    }
	    if(count==1)
	    {
	        System.out.println("yes");
	    }
	    else
	    {
	         System.out.println("no");
	    }
	}
}
