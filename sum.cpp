#include<iostream.h>
#include<conio.h>
void main()
{
  int i,j,n,k,a[100],sum;
  clrscr();
  cout<<"enter the number of elements elements";
  cin>>n;
  cout<<"enter the elements";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"enter the number";
  cin>>k;
  for(j=0;j<k;j++)
  {
    sum=sum+a[j];
  }
  cout<<sum;
  getch();
}
    
