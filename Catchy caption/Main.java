#include <cstring>
#include<string.h>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  int c=0;
  char a[100];
  cin.getline(a,100);
  int res = strlen(a);
  for(int i=0;i<res;i++)
  {
  	if(a[i]==' ')
      c++;
  }
  if(c<10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   
}