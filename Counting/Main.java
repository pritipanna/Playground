#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[200];
  cin.getline(a,200);
  int i, vowel=0,digit=0,ws=0,symbol=0,cons=0;
  int len=strlen(a);
  for(i=0;i<len;i++)
  {
  	if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
    {
    	vowel++;
    }
    else if((int)a[i]>=48&&(int)a[i]<=57)
    {
    	digit++;
    }
    else if(a[i]==' ')
    {
    	ws++;
    }
    else if(((int)a[i]>=33&&(int)a[i]<=47)||((int)a[i]>=58&&(int)a[i]<=64)||((int)a[i]>=91&&(int)a[i]<=96)||((int)a[i]>=123&&(int)a[i]<=126))
    {
    	symbol++;
    }
    else
      cons++;
  }
  cout<<"Vowels:"<<vowel<<endl;
  cout<<"Consonants:"<<cons<<endl;
  cout<<"White Spaces:"<<ws<<endl;
  cout<<"Digits:"<<digit<<endl;
  cout<<"Symbols:"<<symbol<<endl;
  
}