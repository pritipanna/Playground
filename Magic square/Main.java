#include<iostream>
using namespace std;
int main()
{
  int n,sum1=0,sum2=0;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
  	for(int j=0;j<n;j++)
    {
    	cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
  	for(int j=0;j<n;j++)
    {
    	if(i==j)
        {
          sum1=sum1+a[i][j];
        }
      	if((i+j+1)==n)
        {
          sum2=sum2+a[i][j];
        }
      else
        continue;
    }
  }
  if(sum1==sum2)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}