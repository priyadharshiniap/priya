#include<iostream>
using namespace std;
int main()
{
  int i,j,n,k,sum=0;
  cin>>n>>k;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(j=0;j<k;j++)
  {
    sum=sum+a[j];
  }
  cout<<sum;
  return 0;
}
