import java.util.*;
class Numerical
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		String a=s.next();
		int length=a.length();
		int count=0;
	  	char b[]=new char[length+1];
		for(int i=0;i<length;i++)
		{
			b[length-i]=a.charAt(i);
		}
		for(int j=length;j>0;j--)
		{
			if(b[j]=='I')
			{
				count=count+1;
				if(b[j-1]=='V')
				{
				count=count+3;
				--j;
				}
				if(b[j-1]=='X')
				{
				count=count+8;
				--j;
				}
			}
			else if(b[j]=='V')
			{
				count=count+5;
			}
			else if(b[j]=='X')
			{
				count=count+10;
				if(b[j-1]=='L')
				{
				count=count+30;
				--j;
				}
				if(b[j-1]=='C')
				{
				count=count+80;
				--j;
				}
			}
			else if(b[j]=='L')
			{
				count=count+50;
			}
			else if(b[j]=='C')
			{
				count=count+100;
				if(b[j-1]=='D')
				{
				count=count+300;
				--j;
				}
				if(b[j-1]=='M')
				{
				count=count+800;
				--j;
				}
			}
			else if(b[j]=='D')
			{
				count=count+500;
			}
			else if(b[j]=='M')
			{
				count=count+1000;
			}
		}
		System.out.println("VALUE IS:"+count);
	}
}
