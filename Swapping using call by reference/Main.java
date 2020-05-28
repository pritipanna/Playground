#include<iostream>
using namespace std;
int swap(int &a, int &b)
{
	int c= a;
  	a=b;
  	b=c;
  cout<<"After swapping a= "<<a<<" and b="<<b<<endl;
}
int main()
{
	int x, y;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y<<endl;
  swap(x,y);
}