
#include<iostream>
using namespace std;
 class Complex{
    
    public:
    int r,i;
    Complex(){
        r=3;
        i=4;     
    }
    Complex operator+(Complex & im){
        Complex temp;
        temp.r=r+im.r;
        temp.i=i+im.i;
        return temp; 
    }
    
 };

 int main(){
    Complex a,b,c;
    cout<<a.r<<"+"<<a.i<<"i"<<endl;
    cout<<b.r<<"+"<<b.i<<"i"<<endl;
    c=a+b;
    cout<<c.r<<"+"<<c.i<<"i"<<endl;
     return 0;
 }