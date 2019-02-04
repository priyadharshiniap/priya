#include<iostream>
using namespace std;
int main()
{
  int a,b,i;
  cin>>a>>b;
  for(i=a+1;i<b;i++)
  {
    if(i%2==1)
    {
      cout<<i<<" ";
    }
  }
}
