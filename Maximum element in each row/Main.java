#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	cin>>a[i][j];
    }
  }

  for(i=0;i<r;i++)
  {
    int max=0;
  	for(j=0;j<c;j++)
    {
    	if(a[i][j]>max)
        {
        	max=a[i][j];
        }
    }
    cout<<max<<endl;
  }
}