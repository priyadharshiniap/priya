#include<iostream.h>
#include<conio.h>
void main()
{
  int num,power,i; 
  clrscr();
  cout<<"enter the number";
  cin>>num;
  cout<<"enter the power";
  cin>>power;
  for(i=1;i<=power;i++)
  {
    power=power*num;
  }
  cout<<power;
  getch();
}
