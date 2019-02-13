import java.util.*;
import java.lang.*;
import java.io.*;
class Time
{
	public static void main(String[] args) throws java.lang.Exception
	{
        int a,b,c,d,e,f;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
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
        System.out.println(b+" "+c);
	}
}
