#include<iostream>
using namespace std;
int main(){
  
  // Type your code here
  int* a;
  int n, i, f=0, m=0;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
  	cin>>*(a+i);
  }
  
  for(i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
  	f++;
    else
      m++;
  }
  
  cout<<m<<endl<<f;
  return 0;
}