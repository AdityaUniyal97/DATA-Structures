#include<iostream>
using namespace std;
int search(int arr[] , int n , int x)
{
    for(int i = 0 ; i < n ; i++)
    {
        if(arr[i] == x)
        {
            return i;
        }
    }

    return -1;
}

int main()
{
    int arr[] = {20, 5, 7, 25};
    int x = 7;
    int n = sizeof(arr);
    cout<<search(arr , n , x);
}