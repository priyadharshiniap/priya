import java.util.*;
public class Simpleinterest
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int p=sc.nextInt();
	    int t=sc.nextInt();
	    int r=sc.nextInt();
	    int a=p*(100+(r*t));
	    int i=(a/100)-p;
		System.out.println(i);
	}
}
