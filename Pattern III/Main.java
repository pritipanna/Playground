#include<iostream>
using namespace std;
int main()
{
  int n,j;
  cin>>n;
  for(int I=1; I<=n; I++)
  {
    for( j=1; j<=I; j++)
      if (j<I)
      {
        cout<<I<<"*";
      }
    else
    {
      cout<< I<<"\n";
    }
  }
  
  for(int I=n; I>=0; I--)
  {
    for( j=1; j<=I; j++)
      if (j<I)
        cout<< I<<"*";
    else
      cout<< I<<"\n";
  }
}