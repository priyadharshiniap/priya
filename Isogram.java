import java.util.*;
public class Isogram
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int n,i,j,count=0;
	    n=str.length();
	    char ch[]=str.toCharArray();
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<i;j++)
	        {
	            if(ch[i]==ch[j])
	            {
	                count++;
	                i=n;
	                j=i;
	            }
	        }
	    }
	    if(count==0)
	    {
	        System.out.println("yes");
	    }
	    else
	    {
	        System.out.println("no");
	    }
	}
}
