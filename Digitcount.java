import java.util.*;
import java.lang.*;
public class Digitcount
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int i,j=0;
	    int a=sc.nextInt();
	    double b=Math.log10(a);
	    int c=((int) b)+1;
	    System.out.print(c);
	}
}
