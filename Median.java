import java.util.Scanner;

class Median
{
  
	public static void main(String args[])
  
	{
  
		Scanner sc=new Scanner(System.in);
 
		 int i,n,k;
 
		 int a[]=new int[100];

		System.out.println("enter the value of n");
 		n=sc.nextInt();
  
		System.out.println("enter "+n+" values");
  
		for(i=0;i<n;i++)
 
 		{
    
			a[i]=sc.nextInt();
 
		 }
  
		 if(n%2==0)
		{
			k=(n-1)/2;
		}
		else
		{
			k=(n)/2;	
		}
		System.out.println("median is"+a[k]);
	}
}
