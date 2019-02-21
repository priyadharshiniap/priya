import java.util.*;
import java.lang.*;
import java.io.*;
class Countspace
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        while(sc.hasNextLine())
        {
        	String str=sc.next();
            a++;
        }
        System.out.println(a-1);
    }
}
