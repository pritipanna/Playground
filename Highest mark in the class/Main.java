#include<iostream>
using namespace std;
int highest(int x[], int n)
{
  int temp;
  label:
	for(int i=0;i<n;i++)
    {
    	for(int j=i+1;j<n;j++)
        {
        	if(x[i]<x[j])
            {
            	temp=x[j];
              x[j]=x[i];
              x[i]=temp;
            }
          else
            continue;
        }
    }
  return x[0];
}
int main()
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
  	cin>>arr[i];
  }
  int high=highest(arr,n);
  cout<<high;
}