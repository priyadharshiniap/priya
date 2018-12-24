import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str =sc.next();
        int n=str.length();
        int count=0;
        char ch[]=str.toCharArray();
        for(int j=0;j<n;j++)
        {
            if(ch[j]==ch[n-j-1])
            {
                
            }
            else
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
