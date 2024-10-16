#include<iostream>
using namespace std;
int GCD(int a,  int b)
{
    if(b == 0)
    {
        return a;
    }

    return GCD(b , a % b);
}

int LCM(int a , int b)
{
    return (a * b) / GCD(a , b);
}

int main()
{
    int a = 4;
    int b = 6;
    cout<<LCM(a , b);
}

