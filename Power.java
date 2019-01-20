import java.util.*;
public class Power
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int i,d=1;
        for(i=0;i<k;i++)
        {
            d=n*d;
        }
        System.out.println(d);
     }
}
