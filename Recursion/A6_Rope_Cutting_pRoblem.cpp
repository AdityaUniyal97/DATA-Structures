#include<iostream>
using namespace std;

int maxCutt(int n , int a , int b , int c)
{
    if(n == 0)
    {
        return 0;
    }

    if(n <= -1)
    {
        return -1;
    }

    int res = max(maxCutt(n - a , a , b , c),
              max(maxCutt(n - b , a , b ,c),
                  maxCutt(n - c , a , b , c)));

    if(res == -1)
    {
        return 1;
    }            

    return res + 1;  
}

int main()
{
    int n = 5;
    int a  = 2;
    int b = 1; 
    int c = 5;
    cout<<maxCutt(n , a , b , c);
}