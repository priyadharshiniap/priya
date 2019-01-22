import java.util.*;
public class Reverse
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    int n=a.length();
	    int i,j;
	    char b[]=new char[1];
	    char ch[]=a.toCharArray();
	    for (i =n-1; i>=0;--i) 
        {
            System.out.print(ch[i]);
        }
	}
}
