#include<iostream>
using namespace std;
int bsearch(int arr[] , int low , int high , int x)
{
    if(low > high)
    {
        return -1;
    }

    int mid = (low + high) / 2;
    if(arr[mid] == x){
        return mid;
    }
    else if(arr[mid] > x){
        return bsearch(arr , low , mid - 1);
    }
    else{
        return bsearch(arr , mid + 1 , high);
    }
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50, 60, 70};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 20;
    cout<<bsearch(arr , 0 , n - 1);
    return 0;
}