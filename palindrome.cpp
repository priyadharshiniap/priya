#include<iostream.h>
#include<conio.h>
void main()
{
  int n,num,rem,rev=0;
  cin>>n;
  num=n;
  while(n=!0)
  {
    rem=n%10;
    rev=(rev*10)+rem;
	  n=n/10;
  }
   if(rev==num)
	   cout<<"Yes";	
   else
	   cout<<"No";
   return 0;
}
