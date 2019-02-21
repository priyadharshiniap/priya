import java.util.*;
public class Countchar
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
            	count=count+1;
            	if(ch[j]==' ')
            	{
                	j++;
            	}
        	}
		}
        System.out.println(count);
    }
}
