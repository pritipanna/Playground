#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y;
  z=pow((x-3),2)+pow((y-4),2);
  int res= sqrt(z);
  cout<<res;
}