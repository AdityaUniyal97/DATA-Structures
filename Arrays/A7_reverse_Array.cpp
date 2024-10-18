#include<iostream>
using namespace std;

void reverse(int arr[] , int n)
{
    int low = 0;
    int end =  n - 1;
    while(low < end)
    {
        int temp = arr[low];
        arr[low] = arr[end];
        arr[end] = temp;

        low++;
        end--;
    }
}

int main()
{
    int arr[] = {10, 20, 30, 40};
    int n = sizeof(arr) / sizeof(arr[0]);
    reverse(arr , n);
    for(int i = 0 ;i < n ; i++)
    {
        cout<<arr[i]<<" ";
    }
}