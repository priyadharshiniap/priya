import java.util.*;
public class Digitproduct
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int i,b=1,c;
	    while(a!=0)
        {
            c=a%10;
            b=b*c;
            a=a/10;
        }
        System.out.println(b);
	}
}
