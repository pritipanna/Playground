#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  if(x>0&&x<=200)
    cout<<"Rs."<<(int)(x*0.5);
  else if(x>200&&x<=400)
    cout<<"Rs."<<(int)((x*0.65)+100);
  else if(x>400&&x<=600)
    cout<<"Rs."<<(int)((x*0.80)+200);
  else if(x>600)
    cout<<"Rs."<<(int)((x*1.25)+425);
}