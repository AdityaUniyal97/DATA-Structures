//Wap to check if the array is sorted or not
#include<iostream>
using namespace std;

bool isSorted(int arr[] , int n)
{
    for(int i = 1; i < n ; i++)
    {
        if(arr[i] < arr[i - 1])
        {
            return false;
        }
    }
    return true;
}

int main()
{
    int arr[] = {10, 4, 30, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout<<isSorted(arr , n);
}