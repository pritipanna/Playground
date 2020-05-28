#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  long int n;
  int i=0;
  cin>>n;
  do
  {
  	n=n/10;
    i++;
  }while(n!=0); 
  cout<<i;
}