#include<iostream>
using namespace std;
bool isPal(int n)
{
    int temp = n;
    int rev = 0;
    while(temp  != 0)
    {
        int ld = temp % 10;
        rev = rev * 10 + ld;
        temp /= 10;
    }

    return rev == n;
}

int main()
{
    int number = 121;
    cout<<(bool)isPal(number);
    return 0;
}