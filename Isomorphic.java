import java.util.*;
public class Isomorphic
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String str1=sc.next();
	    String str2=sc.next();
	    int n1,n2,i,j,count=0;
	    n1=str1.length();
	    n2=str2.length();
	    int a=n1,b=n1,c=0;
	    char ch1[]=str1.toCharArray();
	    char ch2[]=str2.toCharArray();
	    char ch3[]=new char[n1];
	    if(n1!=n2)
	    {
	        System.out.println("no");
	    }
	    else
	    {
	        for(i=0;i<n1;i++)
	        {
	            for(j=0;j<i;j++)
	            {
	                if(ch1[i]==ch1[j])
	                {
	                    count++;
	                    if(ch2[i]==ch2[j])
	                    {
	                        a--;
	                    }
	                    else
	                    {
	                        System.out.println("no");
	                        i=n1;
	                        c=100;
	                    }
	                    j=i;
	                }
	                else if(ch2[i]==ch2[j])
	                {
	                    count++;
	                    if(ch1[i]==ch1[j])
	                    {
	                        b--;
	                    }
	                    else
	                    {
	                        System.out.println("no");
	                        i=n1;
	                        c=100;
	                    }
	                    j=i;
	                }
	            }
	        }
	        if(count==0)
	        {
	            System.out.println("yes");
	        }
	        else if((c!=100)&&(a<n1||b<n1))
	        {
	            System.out.println("yes");
	        }
	    }
	}
}
