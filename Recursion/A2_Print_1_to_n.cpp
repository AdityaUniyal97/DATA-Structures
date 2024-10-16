#include <iostream>
using namespace std;

void recur(int n)
{
    if(n == 0)
    {
        return ;
    }

    recur(n - 1);
    cout<<n<<endl;
}

int main()
{
    int n = 10;
    recur(n);
}