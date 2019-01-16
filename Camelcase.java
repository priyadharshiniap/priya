import java.util.*;
public class Camelcase
{
	public static void main(String[] args)
	{
	    Scanner read = new Scanner(System.in);
        String a=read.next();
        String outputval;
        Camel c=new Camel();
        System.out.println(c.properCase (a));
	}
}
class Camel
{
	String properCase (String inputVal)
	{
        return inputVal.substring(0,1).toUpperCase()+ inputVal.substring(1).toLowerCase();
    }
}
