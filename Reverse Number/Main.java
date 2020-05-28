#include <iostream>
using namespace std;
int main() 
{
	int n,res;
  int rev=0;
  cin>>n;
  while(n!=0)
  {
  	res=n%10;
    rev= rev*10+res;
    n=n/10;
  }
  cout<<rev;
}