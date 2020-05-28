#include<iostream>
using namespace std;
int main()
{
	int x, y;
  	cin>>x>>y;
  	if(y<x)
      cout<<"Yes, you can enter.";
  	else if(y==x)
      cout<<"Yes, you can enter. Kindly use a rope.";
  	else
      cout<<"Sorry, you can't enter";
}