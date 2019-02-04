#include<iostream>
using namespace std;
int main()
{
  int num,power,i,a=0; 
  cin>>num;
  cin>>power;
  for(i=1;i<=power;i++)
  {
    a=a*num;
  }
  cout<<a;
  return 0;
}
