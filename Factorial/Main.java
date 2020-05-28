#include<iostream>
using namespace std;
int fact(int n)
{
  	if(n==1)
    {
    	return n;
    }
	n=n*fact(n-1);
  
  return n;
}

int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}