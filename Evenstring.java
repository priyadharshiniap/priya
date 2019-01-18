import java.util.*;
public class Evenstring
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int n,i,j,count=0;
	    n=str.length();
	    char ch1[]=str.toCharArray();
	    for(i=0;i<n;i++)
	    {
	        System.out.print(ch1[i]);
	        i++;
	    }
	    System.out.print(" ");
	    for(i=1;i<n;i++)
	    {
	        System.out.print(ch1[i]);
	        i++;
	    }
	}
}
