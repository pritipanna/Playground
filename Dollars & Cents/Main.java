#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  cin>>a>>b>>c>>d;
  e=a+c;
  f=b+d;
  while(f>=100)
  {
  	f=f-100;
    e=e+1;
  }
  
  cout<<e<<endl<<f;
}