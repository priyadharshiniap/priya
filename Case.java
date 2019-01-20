import java.util.*;
public class Case
{
	public static void main(String[] args)
	{
	    Scanner read = new Scanner(System.in);
	    while(read.hasNext())
	    {
        String a=read.next();
        String outputval;
        Camel c=new Camel();
        System.out.print(c.properCase (a)+ " ");
	    }
	}
}
class Camel
{
	String properCase (String inputVal)
	{
        return inputVal.substring(0,1).toUpperCase()+ inputVal.substring(1);
    }
}
