#include<iostream>
using namespace std;
int main()
{
  int x, r, y;
  cin>>x>>r>>y;
  float i, amt, dis, total;
  i= (x*y*r)/100;
  amt=x+i;
  dis=(0.02*i);
  total=amt-dis;
  cout<<i<<endl;
  cout<<amt<<endl;
  cout<<dis<<endl;
  cout<<total<<endl;
}