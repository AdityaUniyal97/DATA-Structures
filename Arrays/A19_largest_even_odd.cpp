#include<iostream>
using namespace std;
int maxEven(int arr[] , int n)
{
    int res = 1;
    int curr = 1;
    for(int i = 1; i < n ; i ++)
    {
        if(arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) // current element is even and previus element is odd
        || (arr[i] % 2 != 0  && arr[i - 1] % 2 == 0) // current odd  and previus is even
        {
            curr++;
            res = max(res , curr);
        }
        else{
            curr = 1;
        }
    }
    return res;
}

int main()
{
    int arr[] = {5, 10, 20, 6, 3, 8};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout<<maxEven(arr , n);
}