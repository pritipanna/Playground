#include<iostream>
using namespace std;
int main()
{
  int x,y;
  int x1,y1;
  cin>>x>>y;
  if(x<y)
    cout<<(y-x);
  else
  {
    x1=1900+x;
  	y1=2000+y;
  	cout<<(y1-x1);}
}