#include <iostream>
using namespace std;
void recurs(int n)
{
    if(n == 0)
    {
        return;
    }
    cout<<n;
    recurs(n - 1);
}

int main()
{
    int n = 5;
    recurs(n);
}