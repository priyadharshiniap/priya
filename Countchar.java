import java.util.*;
public class Countchar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str ="guvi codekata beginner";
        int n=str.length();
        int count=0;
        char ch[]=str.toCharArray();
        for(int j=0;j<n;j++)
        {
            count=count+1;
            if(ch[j]==' ')
            {
                j++;
            }
        }
        System.out.println(str+"--->"+count);
    }
}
