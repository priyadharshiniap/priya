#include <iostream>
using namespace std;
int main()
{
	int n,c=0,i;
	cin>>n;
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			c=c+1;
		}
	}
	if(c==2)
		cout<<"yes";
	else
		cout<<"no";
	return 0;
}
