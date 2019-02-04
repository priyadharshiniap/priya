#include<iostream>
using namespace std;
int main()
{
  int num,power,i; 
  cin>>num;
  cin>>power;
  for(i=1;i<=power;i++)
  {
    power=power*num;
  }
  cout<<power;
  return 0;
}
