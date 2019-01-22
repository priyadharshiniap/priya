import java.util.*;
public class Divideby2
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int i,b=0,c;
	    b=a%2;
	    while(b==0)
        {
            a=a/2;
            b=a%2;
            if(a==0)
            {
                a=1;
            }
        }
        System.out.println(a);
	}
}
