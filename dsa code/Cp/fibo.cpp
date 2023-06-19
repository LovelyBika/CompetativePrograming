#include<iostream>
#include<conio.h>
using namespace std;



int main(){
    int n,a=0,b=1,s=0,i=1;
    cout<<"enter the no ";
    cin>>n;
    cout<<a<<b;
    while(n>=0){
      s=a+b;
       cout<<s;
        a=b;
        b=s;
        n--;
    }
getch();

}