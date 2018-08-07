import java.util.*;
class Index
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int n;
		Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter values"+i);
			a[i]=sc.nextInt();
		}
		for(int j=1;j<n;j++)
		{
		  	System.out.println(a[j]+" "+j);	
		}
    System.out.println();
		sc.close();
	}
}
