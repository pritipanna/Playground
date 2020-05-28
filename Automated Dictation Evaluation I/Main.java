#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char s1[50];
  char s2[50];
  gets(s1);
  gets(s2);
  int res=strcmp(s1,s2);
  if(res==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}