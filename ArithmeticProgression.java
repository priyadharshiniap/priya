import java.util.Scanner;
class ArithmeticProgression
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int d=sc.nextInt();
    int n=sc.nextInt();
    int ap=((n/2)*((2*a)+((n-1)*d)));
    System.out.println(ap);
  }
}
