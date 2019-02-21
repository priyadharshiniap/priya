import java.util.*;
import java.lang.*;
import java.io.*;
class Countline
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
	int count=1;
	while(sc.hasNextLine())
	{
            String str =sc.next();
            int n=str.length();
            char ch[]=str.toCharArray();
            for(int j=0;j<n;j++)
            {
            	if(ch[j]=='.')
            	{
                	j++;
                	count=count+1;
            	}
        	}
	}
        System.out.println(count);
    }
}
