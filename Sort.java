import java.util.Scanner;
class Sort
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int i,j,m,n,k,t;
    int a[]=new int[100];
    n=sc.nextInt();
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
