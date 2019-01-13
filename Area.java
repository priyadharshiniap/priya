import java.util.*;
public class Area
{
	public static void main(String[] args)
	{
	    float a,b,c;
	    Scanner sc=new Scanner(System.in);
	    a=sc.nextFloat();
	    b=sc.nextFloat();
	    c=a*b;
		System.out.println(String.format("%.5f",c));
	}
}
