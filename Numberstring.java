import java.util.*;
public class Numberstring
{
    public static void main(String []args)
    {
        int i,a=0;
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        int n=ss.length();
        char[] s=new char[n];
        for(int j=0;j<n;j++)
        {
            s[j]=ss.charAt(j);
        }
        for(i=0;i<n;i++)
        {
            if((s[i]>='0')&&(s[i]<='9'))
            {
                System.out.print(s[i]);
            }
        }
     }
}
