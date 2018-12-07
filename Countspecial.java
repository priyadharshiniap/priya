import java.util.*;
public class Countspecial
{
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        String str ="gu3vi._2codek@ta 1beginner.";
        int n=str.length();
        int count=0;
        char ch[]=str.toCharArray();
        for(int j=0;j<n;j++)
        {
            if((ch[j]>='a'&&ch[j]<='z')||ch[j]==' '||(ch[j]>='0'&&ch[j]<='9'))
            {
                //j++;
                //count=count+1;
            }
            else
            {
                j++;
                count=count+1;
            }
        }
        System.out.println(str+"--->"+count);
	}
}
