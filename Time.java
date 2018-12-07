import java.util.*;
public class Time
{
	public static void main(String[] args)
	{
        int a,b,c,d,e,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter time1");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter time2");
        c=sc.nextInt();
        d=sc.nextInt();
        e=(a*60)+b;
        f=(c*60)+d;
        if(e>f)
        {
            e=e-f;
        }
        else
        {
            e=f-e;
        }
        b=e/60;
        c=e%60;
        System.out.println(b+"hours"+c+"minutes");
	}
}
