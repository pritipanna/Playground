#include<iostream>
using namespace std;
int search(int x[], int size, int reg)
{
  int flag=0;
	for(int i=0;i<size;i++)
    {
    	if(reg==x[i])
        {
          flag=1;
          break;
        }
      	else
          continue;
     }
	return(flag);
}

int main()
{
  int reg;
  int size;
  cin>>size;
  int x[size];
  for(int i=0;i<size;i++)
  {
  	cin>>x[i];
  }
  
  cin>>reg;
  int flag=search(x,size,reg);
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}