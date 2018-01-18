#include<iostream.h>
#include<conio.h>
void main()
{
  int a,i;
  cin>>a;
  for(i=1;i<=a;i++)
  {
    if(a%i==0)
    {
     if(i%2==0)
     {
       cout<<i;
     }
    }
  }
  getch();
}
