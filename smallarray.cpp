#include<iostream>
int main()
{
  int a[100],n,i,b;
  cin>>n;
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
  return 0;
}
      
      
      
        
