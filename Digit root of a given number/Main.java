#include<iostream>
using namespace std;
int digir(int n)
{
  int sum=0;
	if(n>9)
    {
      	sum=digir(n%10)+digir(n/10);
    	return(digir(sum));
    }
  else
    return n;
}

int main()
{
	int n;
  cin>>n;
  cout<<digir(n);
}