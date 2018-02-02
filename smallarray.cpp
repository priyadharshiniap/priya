#include<iostream.h>
#include<conio.h>
void main()
{
  int a[100],n,i,b;
  clrscr();
  cout<<"enter no of elements";
  cin>>n;
  cout<<"enter array elements";
  for(i=0;i<n;i++)
  {
    cin<<a[i];
  }
  b=a[0];
  for(i=1;i<n;i++)
  {
    if(b<a[i]);
    else
    {
      b=a[i];
    }
  }
  cout<<b;
  getch();
}
      
      
      
        
