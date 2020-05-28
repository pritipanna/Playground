#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  if((z>x&&z<=(x+x))||(z>(x*(y-2))&&z<=(x*(y-1))))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}