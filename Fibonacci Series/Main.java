#include<iostream>
using namespace std;
int fibo(int n)
{
	if(n==1)
    {
    	return 0;
    }
  	else if(n==2)
    {
    	return 1;
    }
  else
  {
  	return(fibo(n-1)+fibo(n-2));
  }
}

int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fibo(n);
}