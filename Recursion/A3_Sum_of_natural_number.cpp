#include<iostream>
using namespace std;
int recur(int n)
{
    if(n == 0)
    {
        return 1;
    }

    return n + recur(n - 1);
}

int main()
{
    int n = 5;
    cout<<recur(n)<<endl;
}