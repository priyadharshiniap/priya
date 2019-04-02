import java.util.*;
import java.lang.*;
import java.io.*;
class Stri
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str =sc.next();
		int a=sc.nextInt();
		char ch[]=str.toCharArray();
		for(int j=0;j<a;j++)
		{
			System.out.print(ch[j]);
		}
	}
}
