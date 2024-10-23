#include<iostream>
using namespace std;
void merge(int arr[] , int l , int m , int h)
{
    int n1 = m - l + 1;
    int n2 = h - m;
    int left[n1];
    int right[n2];
    for(int i = 0 ; i < n1 ; i++)
    {
        left[i] = arr[i + l];
    }
    for(int j = 0 ; j < n2 ; j++)
    {
        right[j] = arr[m + l + j];
    }
    int i = 0;
    int j = 0;
    int k = l;
    while(i < n1 && j < n2)
    {
        if(arr[i] <= right[j])
        {
            arr[k++] = left[i++];
        }
        else{
            arr[k++] = right[j++];
        }
    }

    while(i < n1)
    {
        arr[k++] = left[i++];
    }
    while(j < n2)
    {
        arr[k++] = right[j++];
    }
}