#include<iostream.h>
#include<conio.h>
void main()
{
  int a,b,i;
  clrscr();
  cout<<"enter interval";
  cin>>a>>b;
  for(i=a;i<=b;i++)
  {
    if(i%2==1)
    {
      cout<<i;
    }
  getch();
}
