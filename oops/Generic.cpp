#include<iostream>
#include<conio.h>
using namespace std;
template <class t>
void fun(t a, t b){
  t s;
  s=a+b;
   cout<<"sum of two no "<<s<<endl;
}
int main(){
    
    fun(4,8);
    fun(3.4,2.4);
    return 0;

}