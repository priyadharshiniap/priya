import java.util.*;
class Maximum
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int max,n;
		Scanner sc=new Scanner(System.in);
                n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter values"+i);
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int j=1;j<n;j++)
		{
			if(max<a[j])
			{
				max=a[j];
			}
				
		}
		System.out.println("maximum is"+max);
		sc.close();
	}
}
