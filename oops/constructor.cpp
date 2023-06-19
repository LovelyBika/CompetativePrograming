#include<iostream>
using namespace std;
class M{
    public:
    int a,f;
    M(){
        a=4;
        f=5;

  }
    M(int p,int u){
        a=p;
        f=u;

  }


//  M(const M & x){
//     a=x.a;
//     f=x.f;
//  }{
void getdata(){
    cin>>a;
    cin>>f;
}
 void putdata()
{
    cout<<a<<endl;
    cout<<f<<endl;

}
   
};
int main()
{
    M ob1(2,6),o2=ob1;
    //ob1.getdata();
    ob1.putdata();
    o2.putdata();
    
      
    return 0;
}