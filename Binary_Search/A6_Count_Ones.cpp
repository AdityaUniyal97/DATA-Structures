#include<iostream>
using namespace std;
int countOnes(int arr[] , int n)
{
    int low= 0 ;
    int high = n - 1;
    while(low <= high)
    {
        int mid = (low + high) / 2;

        if(arr[mid] == 0)
        {
            low = mid + 1;\\\\\\\\\\\\
        }
    }
}