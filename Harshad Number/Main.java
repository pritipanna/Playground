#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,r,sum=0;
  cin>>n;
  int num=n;
  do
  {
  	r=n%10;
    n=n/10;
    sum=sum+r;
  }while(n!=0);
  
  if((num%sum)==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}