#include<iostream>
using namespace std;
int reDups(int arr[] , int n)
{
    int res = 1;
    for(int i = 1; i < n ; i++)
    {
        if(arr[res - 1] != arr[i])
        {
            arr[res] = arr[i];
            res++;
        }
    }
    return res;
}

int main()
{
    int arr[] = {10, 20, 30, 30, 30, 40, 40};
    int n = sizeof(arr) / sizeof(arr[0]);
    n = reDups(arr , n);
    for(int i =0 ; i < n ; i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;
}
