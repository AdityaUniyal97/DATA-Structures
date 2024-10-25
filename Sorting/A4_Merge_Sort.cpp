#include<iostream>
using namespace std;
 void merge(int arr[] , int l , int m , int h)
 {
    int n1 = m - l + 1;
    int n2 = h - m ;
    for(int i = 0 ;i < n1 ; i++)
    {
        left[i] = arr[i + l];
    }
    for(int j = 0 ; j < n2 ; j++)
    {
        right[j] = arr[m + 1 + j];
    }
    int i = 0;
    int j = 0;
    int k = l;
    while(i < n1 && j < n2)
    {
        if(left[i] <= right[j]) 
        {
        arr[k++] = left[i++];
        }
        else
        {
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

void mergeSort(int arr[] , int l , int r)
{
    if(r < l)
    {
        int m = l+(r - l) / 2;
        merge(arr , l , m);
        merge(arr , m + 1 , r);
        merge(arr , l , m , r);
    }
}

int main()
{
    int arr[] = 10 , 5 , 9 , 2;
    int l =  0;
    int r =  4;
    merge(arr , l , r);
    for(int x : arr)
    {
        cout<<x<<" ";
    }
}