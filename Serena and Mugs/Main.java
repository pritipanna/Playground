#include<iostream>
using namespace std;
int printresult(int* a, int n, int s)
{
  int count=0, sum=0;
	for(int i=0;i<n;i++)
    {
    	if(a[i]<s)
        {
        	count++;
          sum=sum+a[i];
        }
      else
      {
        break;
      }
    }
  if(count>(n-1)&&sum<=s)
  {
  	return(1);
  }
  else
  {
  	return(0);
  }
}

int main()
{
  int n,s;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
  {
  	cin>>a[i];
  }
  int res=printresult(a,n,s);
  if(res==1)
    cout<<"YES";
  else
    cout<<"NO";
}