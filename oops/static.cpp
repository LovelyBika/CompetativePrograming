#include<iostream>
using namespace std;
class MyClass{
public:
 static int a;
 void getdata()
{ 
    cin>>a;

} void putdata()
 {
    cout<<a;
 }
};

int MyClass::a=2;

int main(){
    
    MyClass ob1,ob2;
    
    ob1.putdata();
    ob2.putdata();
    return 0;
    
}