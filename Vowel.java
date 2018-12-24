import java.util.*;
public class Vowel
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
            if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }
    }
}
