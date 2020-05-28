#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, se=0, so=0, r;
  int num=n;
  cin>>n;
  while(n>0)
  {
  	r=n%10;
    if(r%2==0)
    {
    	se=se+r;
    }
    else
    {
    	so=so+r;
    }
    n=n/10;
  }
  
  if(se==so)
    cout<<"Yes";
  else
    cout<<"No";
}