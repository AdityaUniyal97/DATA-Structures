#include<iostream>
using namespace std;

int deletes(int arr[] , int n , int x)
{
    int i =0 ;
    for(i = 0 ; i < n ; i ++)
    {
        if(arr[i] == x)
        {
            break;
        }

        if(i == n)
        {
            return n;
        }

        for(int j = i ; j < n - 1 ;j++)
        {
            arr[j] = arr[j + 1];
        }

    }
    return n - 1;
}

int main()
{
    int arr[] = {10, 20, 30};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 20;
    n = deletes(arr , n , x);
    for(int i =0 ; i < n ; i ++)
    {
        cout<<arr[i]<<" "; 
    }
}