import java.util.*;
import java.lang.*;
import java.io.*;
class Numberalp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		while(sc.hasNext())
		{
	        String str =sc.next();
	        int n=str.length();
	        char ch[]=str.toCharArray();
	        for(int j=0;j<n;j++)
	        {
	            if(ch[j]>='0'&&ch[j]<='9')
	            {
	                a++;
	            }
	        }
		}
        if(a>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
	}
}
