#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string str;
  	getline(cin,str);
  	for(string::reverse_iterator i=str.rbegin();i<str.rend();i++)
    {
    	cout<<*i;
    }
  
}