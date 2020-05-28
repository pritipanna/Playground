#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char arr[50];
  gets(arr);
  int res=strlen(arr);
  cout<<"The number of letters in the name is "<<res;
}