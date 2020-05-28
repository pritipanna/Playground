#include<iostream>
using namespace std;
int power(int a, int n)
{
  int count=0;
	if(a==1||n==0)
      return 1;
  else
  {
  	if(count!=n)
      return(a*power(a,n-1));
  	count++;
  }
  
  
}
int main()
{
  int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}