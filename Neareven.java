import java.util.*;
class Neareven
{
  public static void main(String args[])
  {
    int a;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    if(a%2==0)
    {
      System.out.println(a);
    }
    else
    {
      System.out.println(a-1);
    }
  }
}
