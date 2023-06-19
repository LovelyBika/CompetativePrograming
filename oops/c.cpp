#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	int x,y;
	
	while(t--){
	    cin>>x>>y;
        if(x<=y)
	    cout<<"yes"<<endl;
	    else 
	    if(x>y)
	    cout<<"mo"<<endl;
	    
	}
	return 0;
}
