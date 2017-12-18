#include<iostream.h>
#include<conio.h>
void main()
{
  int a;
  clrscr();
  cout<<enter the number;
  cin>>a;
  if(a<0)
  {
    cout<<a<<"is negative";
  }
  else if(a>0)
  {
    cout<<a<<"is positive";
  }
  else
  {
    cout<<a<<"is zero";
  }
  getch();
  return 0;
