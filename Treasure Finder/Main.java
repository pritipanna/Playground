#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  cin>>x>>y>>z;
  int greater;
  if(x>=y && x>=z)
  {
  	if(y>=z)
    {
      greater=y;
      cout<<"The treasure is in box which has number "<<y;
    }
    else
    {
      greater=z;
      cout<<"The treasure is in box which has number "<<z;
    }
  }
  else if(y>=x&&y>=z)
  {
  	if(x>=z)
    {
    	greater=x;
      cout<<"The treasure is in box which has number "<<x;
    }
    else
    {
    	greater=z;
      cout<<"The treasure is in box which has number "<<z;
    }
  }
  else if(z>=x&&z>=y)
  {
  	if(x>y)
    {
    	greater=x;
      cout<<"The treasure is in box which has number "<<x;
    }
    else
    {
    	greater=y;
      cout<<"The treasure is in box which has number "<<y;
    }
  }
  	
  
  	
  int gcd;
  for(gcd=greater;gcd>=1;gcd--)
  {
  	if(x%gcd==0&&y%gcd==0&&z%gcd==0)
      break;
  }
  
  cout<<"\nThe code to open the box is "<<gcd;
  
}