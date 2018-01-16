#include<iostream.h>
#include<conio.h>
void main()
{
  int a,b,c,d;
  clrscr();
  cout<<"enter a number";
  cin>>a;
  b=a%10;
  c=a/10;
  d=b+c;
  cout<<"square of the digit is"<<d;
  getch();
}
