#include<iostream>
#include<math.h>
using namespace std;
void req(int x, int y, int z)
{
	int w=pow(x,y);
  if(w>=z)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}

int main()
{
	int a,b,c;
  cin>>a>>b>>c;
  req(a,b,c);
}