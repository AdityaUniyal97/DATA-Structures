#include<iostream>
using namespace std;
static int power(int x , int n)
{
    int res = 1;
    while(n > 0)
    {
        if(n % 2 == 0)
        {
            res = res * x;
        }
        x = x * x;
        n = n / 2;
    }
}

int main()
{
    int x = 2;
    int n = 3;
    cout<<power(x , n);
}