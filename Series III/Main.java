#include"iostream"
using namespace std;
int main()
{
	int n,i, sum=6, j=5;
  cin>>n;
  for(i=0;i<n;i++)
  {
  	cout<<sum<<" ";
    sum=sum+j;
    j=j+5;
  }
}