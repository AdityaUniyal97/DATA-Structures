/*
Ip = {2, 3, 10, 6, 4, 8, 1}
Op = 8: MAx Difference is betweeen the 10 and 2 
*/
#include<iostream>
using namespace std;
int maxDiff(int arr[], int n)
{
    int res = arr[1] - arr[0];
    int min_val = arr[0];
    for(int i = 1;i < n ; i++)
    {
        res = max(res , arr[i] - min_val);
        min_val = min(min_val , arr[i]);
    }
    return res;
}

int main()
{
    int arr[] = {2, 3, 10, 6, 4, 8, 1};
    int n = 7;
    cout<<maxDiff(arr , n);
}