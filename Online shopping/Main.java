#include<iostream>
using namespace std;
int main()
{
	int x1,x2,x3,y1,y2,y3,z1,z2,z3, flipkart, snapdeal, amazon;
  	cin>>x1>>x2>>x3>>y1>>y2>>y3>>z1>>z2>>z3;
  	int disf= (x1*x2)/100;
  	int totalf= (x1+x3)-disf;
  	int diss= (y1*y2)/100;
  	int totals= (y1+y3)-diss;
 	int disa= (z1*z2)/100;
  	int totala= (z1+z3)-disa;
  
  	cout<<"In Flipkart Rs."<<totalf<<endl;
 	cout<<"In Snapdeal Rs."<<totals<<endl;
  	cout<<"In Amazon Rs."<<totala<<endl;
  
  if(totalf<=totals && totalf<=totala)
    cout<<"He will prefer Flipkart";
  else if(totals<totalf && totals<totala)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
    
  
}