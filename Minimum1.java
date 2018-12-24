import java.util.Scanner;
class Minimum1
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int min,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter value "+i);
			a[i]=sc.nextInt();
		}
		for(k=0;k<n;k++)
		{
		min=a[k];
		for(int j=1;j<n;j++)
		{
			if(min<a[j])
			{
				min=a[j];
			}
				
		}
		System.out.println("minimum is"+min);
		sc.close();
	}
	}
}
