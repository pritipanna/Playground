#include<iostream>
using namespace std;
int main()
{
  int age;
  float time;
  cin>>age>>time;
  if(age>13)
  {
  	if(time>13&&time<14)
    {
    	cout<<"$5.00";
    }
    else
    {
    	cout<<"$8.00";
    }
  }
  else if(age<=13)
  {
    if(time>13&&time<14)
    {
    	cout<<"$2.00";
    }
    else
    {
    	cout<<"$4.00";
    }
  }
}