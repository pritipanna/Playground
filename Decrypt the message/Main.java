#include<iostream>
using namespace std;
int main ()
{  
    int i, num, sum=0, n1,n2;
    cin >> n1>>n2;
  	num=n1+n2;
    for (i=1; i < num; i++)
    {
        if ((num%i) == 0)
            sum = sum + i;
    }
    if (sum == num)
        cout <<"They can read the message";
    else
        cout <<"They can't read the message";
    return 0;
}