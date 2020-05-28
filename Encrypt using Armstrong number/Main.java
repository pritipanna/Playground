#include<iostream>
#include<math.h>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
bool arm(int n)
{
    //Your code goes here
  bool flag;
  int count=0, sum=0, res;
  int num=n;
  while(num!=0)
  {
  	num=num/10;
    count++;
  }
  int temp=n;
  while(temp!=0)
  {
  	res=temp%10;
	sum=sum+pow(res,count);
    temp=temp/10;
  }
  if(sum==n)
    flag=1;
  
  return flag;

}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}