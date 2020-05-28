#include<iostream>
using namespace std;
int main()
{  
  int n1,n2,i,j;
  cin>>n1>>n2;
  for(j=n1;j<=n2;j++)
  {
    int sum=0;
  	for (i=1; i < j; i++)
    {
        if ((j%i) == 0)
            sum = sum + i;
    }
    if(sum==j)
      cout<<j<<" ";
  }
  return 0;
}