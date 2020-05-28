#include<iostream>
using namespace std;
int main()
{
  int x,y,z, sumad, sumki;
  cin>>x>>y>>z;
  sumad= y*75;
  sumki= z*30;
  int sum=sumad+sumki;
  if(sum<=x)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}