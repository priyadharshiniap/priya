import java.util.*;
public class Maximum
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,max=0;
		for(i=0;i<10;i++)
		{
		    a[i]=sc.nextInt();
		    if(a[i]>max)
		    {
		        max=a[i];
		    }
		    //System.out.println(max);
		}
		System.out.println(max);
	}
}
