#include<iostream>
using namespace std;
int gcd(int x, int y, int s)
{
  if(x%s==0&&y%s==0)
    {
    	return s;
    }
    else
    {
    	s--;
      	gcd(x,y,s);
    }
}

int main()
{
  int x,y;
  cin>>x>>y;
  int s;
  s=(x>y?y:x);
  cout<<"G.C.D of "<<x<<" and "<<y<<" = "<<gcd(x,y,s);
}