#include<iostream>
using namespace std;
int main()
{
  int n;
  float t;
  cin>>n>>t;
  if(n<2)
    cout<<t;
  else if(n==2)
  {
  	float rest;
    rest= t + (t/2);
    cout<<rest;
  }
  else if(n==3)
  {
  	float rest;
    rest = t*2;
    cout<<rest;
  }
  else
    cout<<"Number of items is more";
}