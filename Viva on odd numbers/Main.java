#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float score=0;
  int c=0;
    label:
  cin>>n;
  while(n>0)
  {
    if(n%2==1&&n>0)
    {
    	score=score+1;
      c++;
      if(c==3)
      {
      	break;
      }
      goto label;
    }
    else if(n%2==0)
    {
    	score=score-0.5;
      goto label;
    }
  }
    
 while(n<=0)
    {
    	score=score-1;
      	break;
    }
  cout<<fixed<<setprecision(1)<<score;
}