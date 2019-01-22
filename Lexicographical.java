import java.util.*;
public class Lexicographical
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    int n=a.length();
	    int i,j;
	    char b[]=new char[1];
	    char ch[]=a.toCharArray();
	    for (i = 0; i < n; ++i) 
        {
            for (j = i + 1; j < n; ++j)
            {
                if (ch[i] > ch[j]) 
                {
                    b[0] =  ch[i];
                    ch[i] = ch[j];
                    ch[j] = b[0];
                }
            }
        }
		for (i = 0; i < n; ++i) 
        {
            System.out.print(ch[i]);
        }
	}
}
