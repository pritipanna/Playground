#include<iostream>
using namespace std;
int main()
{
	int a[10], i, j;
	for(i=0;i<10;i++)
	{
		cin>>a[i];
	}
	for(i=0;i<10;i++)
	{
		cout<<a[i]<<" ";
	}
	cout<<"\n";
	int temp;
	for(i=0,j=9;i<9/2;i++,j--)
	{
		temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	for(i=0;i<10;i++)
	{
		cout<<a[i]<<" ";
	}
}
