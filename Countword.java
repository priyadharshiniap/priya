import java.util.*;
import java.lang.*;
import java.io.*;
class Countword
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        while(sc.hasNextLine())
        {
        	String str=sc.next();
            a=a+1;
        }
        System.out.println(a);
    }
}
