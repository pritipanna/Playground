#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,j=104,sum=121;
  cin>>n;
    for(i=0;i<n;i++)
    {
    	cout<<sum<<" ";
      	sum=sum+j;
      	j=j+32;
    }
}