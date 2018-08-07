import java.util.*r;
class Maximum
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int min,n;
		Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter values"+i);
			a[i]=sc.nextInt();
		}
		min=a[0];
		for(int j=1;j<n;j++)
		{
			if(min<a[j])
			{
				min=a[j];
			}
				
		}
		System.out.println("maximum is"+min);
		sc.close();
	}
}
