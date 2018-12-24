import java.util.*;
public class Numberalp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str ="gu2vi. codekata beginner.";
        int n=str.length();
        int c=0,a=0,d;
        char ch[]=str.toCharArray();
        for(int j=0;j<n;j++)
        {
            if((ch[j]>='a'&&ch[j]<='z')||ch[j]=='.'||ch[j]==' ')
            {
                c=1;
            }
            if(ch[j]>='0'&&ch[j]<='9')
            {
                a=1;
            }
        }
        d=c+a;
        if(a>0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
