#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[50];
  gets(a);
  int res=strlen(a);
  for(int i=0;i<res;i++)
  {
  	if(((int)a[i]>=65&&(int)a[i]<=90)||((int)a[i]>=97&&(int)a[i]<=122))
      cout<<a[i];
  }
}