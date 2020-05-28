#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  if((z>0&&z<=y)||(z%y==0)||(z%y==1))
  {
  	cout<<"Yes";
  }
  else
    cout<<"No";
    
}