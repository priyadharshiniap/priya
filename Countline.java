import java.util.*;
public class Countline
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str ="guvi. codekata beginner.";
        int n=str.length();
        int count=0;
        char ch[]=str.toCharArray();
        for(int j=0;j<n;j++)
        {
            if(ch[j]=='.')
            {
                j++;
                count=count+1;
            }
        }
        System.out.println(str+"--->"+count);
    }
}
