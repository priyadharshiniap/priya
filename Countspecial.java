import java.util.*;
class Countspecial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        while(sc.hasNextLine())
		{
			String str =sc.next();
        		int n=str.length();
        		char ch[]=str.toCharArray();
        		for(int j=0;j<n;j++)
        		{
            			if((ch[j]>='a'&&ch[j]<='z')||ch[j]==' '||(ch[j]>='0'&&ch[j]<='9')||(ch[j]>='A'&&ch[j]<='Z'));
            			else
            			{
                			count++;
            			}
        		}
		}
        System.out.println(count);
    }
}
