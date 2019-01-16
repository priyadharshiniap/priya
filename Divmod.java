import java.util.*;
public class Divmod
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int d=0;
	    int a=sc.nextInt();
	    String b=sc.next();
	    int c=sc.nextInt();
	    switch(b)
	    {
	        case "%":
	            d=a%c;
	            break;
	       case "/":
	           d=a/c;
	           break;
	    }
		System.out.println(d);
	}
}
