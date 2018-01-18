#include<iostream.h>
#include<conio.h>
void main()
{
  int a,b,c=0,i,j;
  cin>>a;
  for(i=1;i<=a;i++)
  {
    if(a%i==0)
    {
      for(j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          c=c+1;
         }
      }
      if(c==2)
      {
        cout<<i;
      }
    }
  }
  getch();
}
