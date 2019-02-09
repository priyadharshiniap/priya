import java.util.Scanner;
class Sorting
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int i,j,m,n,k,t;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(j=0;j<n;j++)
    {
    for(m=j+1;m<n;m++)
    {
      if(a[j]>a[m])
      {      
        t=a[m];
        a[m]=a[j];
        a[j]=t;
      }
    }
  }
  for(k=0;k<n;k++)
  {
    System.out.print(a[k]+"  ");
  }
  }
}
