#include<iostream>
using namespace std;
int gcd(int x,int y,int z)
{
	int small, gcd;
  	
  if(x<y&&x<z)
   		small=x;
  	
  	else if(y<x&&y<z)
    	small=y;
  	
  	else
    	small=z;
  
  while(small!=0)
  {
  	if((x%small==0)&&(y%small==0)&&(z%small==0))
    {
      gcd=small;
      break;
    }
    
    else
      small--;
  }
  
  return gcd;
}
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int res=gcd(a,b,c);
  if(res==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}