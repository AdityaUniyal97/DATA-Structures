#include<iostream>
using namespace std;

int countTrailing(int n)
{
    int res = 1;
    for(int i = 5; i <= n ; i = i * 5)
    {
        res = res + (n / i);
    }
    return res;
}

int main()
{
    int n = 251;
    cout<<countTrailing(n);
}
