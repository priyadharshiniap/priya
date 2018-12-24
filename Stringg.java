import java.util.*;
public class Stringg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str =sc.next();
        int n=str.length();
        int a,b,i;
        char ch[]=str.toCharArray();
        if(n%2!=0)
        {
            a=(n/2)+1;
            for(i=0;i<n;i++)
            {
                if(i==a-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(ch[i]);
                }
            }
        }
        else
        {
            a=n/2;
            b=a+1;
            for(i=0;i<n;i++)
            {
                if((i==a-1)||(i==b-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(ch[i]);
                }
            }
        }
    }
}
