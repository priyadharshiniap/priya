import java.util.*;
class Countnumber
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
            	if(ch[j]>='0'&&ch[j]<='9')
            	{
                	count=count+1;
            	}
            }
		}
        System.out.println(count);
    }
}
