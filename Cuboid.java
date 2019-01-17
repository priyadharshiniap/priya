import java.util.*;
public class Cuboid
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int l=sc.nextInt();
	    int w=sc.nextInt();
	    int h=sc.nextInt();
	    int area,volume;
	    area=2*((l*w)+(w*h)+(l*h));
	    volume=l*w*h;
		System.out.println(area+" "+volume);
	}
}
