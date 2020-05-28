#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,br,r1,r2,r3,r4,r5,r6,r7,r8=0;
  int ed,td,tr;
  int sun,mon,tue,wed,thur,fri,sat;
  cin>>sun>>mon>>tue>>wed>>thur>>fri>>sat;
  r1=sun*150;
  r7=sat*125;
  if(mon<=8)
  {
  	r2=mon*100;
  }
  else if(mon>8)
  {
  	b=mon-8;
    br=(b*100)+b*15;
    r2=br+800;
  }
 
  if(tue<=8)
  {
  	r3=tue*100;
  }
  else if(tue>8)
  {
  	b=tue-8;
    br=(b*100)+b*15;
    r3=br+800;
  }
 
  if(wed<=8)
  {
  	r4=wed*100;
  }
  else if(wed>8)
  {
  	b=wed-8;
    br=(b*100)+b*15;
    r4=br+800;
  }

  if(thur<=8)
  {
  	r5=thur*100;
  }
  else if(thur>8)
  {
  	b=thur-8;
    br=(b*100)+b*15;
    r5=br+800;
  }
 
  if(fri<=8)
  {
  	r6=fri*100;
  }
  else if(fri>8)
  {
  	b=fri-8;
    br=(b*100)+b*15;
    r6=br+800;
  }
  td=mon+tue+wed+thur+fri;
  if(td>40)
  {
  	ed=td-40;
    r8=(ed*25)+(ed*100);
  }
  tr=r1+r2+r3+r4+r5+r6+r7+r8;
  cout<<tr;
}