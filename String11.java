import java.util.*;
public class String11
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    int k=sc.nextInt();
	    char ch[]=a.toCharArray();
	    int n=a.length();
	    int m=n-k;
	    int i,count=1,j,b=0,c=0;
	    for(i=m;i<n;i++)
	    {
	        System.out.print(ch[i]);
	    }
	}
}
