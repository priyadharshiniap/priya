import java.util.*;
class Roman
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		int length= (int) (Math.log10(a)+1);
		int c=length;
		int b[]=new int[length+1];
		for(int i=1;i<=length;i++)
		{
			b[i]=a%10;
			a=a/10;
		}
		for(int j=length;j>0;j--)
		{
			
			Rnum obj=new Rnum();
			obj.Value(b[j],j);
		}
	}
}
class Rnum
{
	void Value(int d, int a)//d=value,a=length
	{
		int f=d%10;
		int g=d%5;
		if(a==1)
		{
			if(f==4)
			{
				System.out.print("IV");
			}
			if(f==9)
			{
				System.out.print("IX");
			}
			if(f>=5&&f<9)
			{
				System.out.print("V");
				for(int i=0;i<g;i++)
				{
					System.out.print("I");
				}
			}
			if(f<4)
			{
				for(int i=0;i<f;i++)
				{
					System.out.print("I");
				}
			}
		}
			
		
		if(a==2)
		{
			if(f==4)
			{
				System.out.print("XL");
			}
			if(f==9)
			{
				System.out.print("XC");
			}
			if(f>=5&&f<9)
			{
				System.out.print("L");
				for(int i=0;i<g;i++)
				{
					System.out.print("X");
				}
			}
			if(f<4)
			{
				for(int i=0;i<f;i++)
				{
					System.out.print("X");
				}
			}
		}

		if(a==3)
		{
			if(f==4)
			{
				System.out.print("CD");
			}
			if(f==9)
			{
				System.out.print("CM");
			}
			if(f>=5&&f<9)
			{
				System.out.print("D");
				for(int i=0;i<g;i++)
				{
					System.out.print("C");
				}
			}
			if(f<4)
			{
				for(int i=0;i<f;i++)
				{
					System.out.print("C");
				}
			}
		}

		if(a==4)
		{
			if(f>=5)
			{
				System.out.println("your number is greater than 5000");
			}
			if(f<5)
			{
				for(int i=0;i<f;i++)
				{
					System.out.print("M");
				}
			}
		}
	}
}
