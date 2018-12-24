import java.util.*;
public class Limit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,i,count=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(i=b;i<=c;i++)
        {
            if(i==a)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
