#include <iostream>
using namespace std;

int memo[10000];
int fib(int n)
{
    if (memo[n] == -1)
    {
        int res;
        if (n == 0 || n == 1)
        {
            res = n;       
            memo[n] = res; 
        }
        else
        {
            res = fib(n - 1) + fib(n - 2);
            memo[n] = res;
        }
    }
    return memo[n];
}

int main()
{
    int n = 5;
    cout << fib(n) << endl;
}