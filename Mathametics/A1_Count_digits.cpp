#include<iostream>
using namespace std;
int countDigits(int x)
{
    int res = 0;
    while(x > 0)
    {
        x /= 10;
        res++;
    }
    return res;
}

int main()
{
    int number = 790;
    cout<<countDigits(number)<<endl;
    return 0;
}