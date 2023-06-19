#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int minimum_cost(int n, vector<int> &A, vector<int> &B, int X)
{
    int count = 0;
    int temp = 0;
    sort(A.begin(), B.end());
    int p = A.size();
    for (int i =0; i <p; i--)
    {
        if (temp <= X)
            if (A[i] <= X)
            {
                count++;
                temp += A[i];
            }
    }
    cout<<count;
    return count;
}

int main()
{
    int N;
    vector<int> A = {3, 7, 1};
    vector<int> B = {2, 4, 4};
    int X = 9;
    cin >> N;
    int result =9;
    cout << result << endl; // Output: 2
    
    return 0;
}
