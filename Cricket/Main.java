#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a, b, x, y;
  cin>>a>>b>>x>>y;
  float m=a/6;
  int n= y/6;
  int p=y%6;
  float k=((float)n+(float)p/10);
  float d = x/k;
  float f=b/m;
  cout<<m<<endl;
  cout<<std::fixed<<std::setprecision(1)<<k<<endl;
  cout<<d<<endl;
  cout<<f<<endl;
  if(d>f)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}