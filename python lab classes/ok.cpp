#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{ //cls("system");
  for(int i=0;i<5;i++)
  { for(int j=0;j<=i;j++)
  {cout<<"# ";
  }
  cout<<"\n";
  }
   for(int i=0;i<5;i++)
  { for(int j=i;j<=5;j++)
  {cout<<"* ";
  }
  cout<<"\n";
  }
return 0;
}