#include <iostream>
using namespace std;
int fact(int n)
{
    int res = 1;
    for(int i = 1; i <= n ; i++)
    {
        res = res  * i;
    }
    return res;
}
int main()
{
    int number = 5;
    cout<<fact(n);
    return 0;
}