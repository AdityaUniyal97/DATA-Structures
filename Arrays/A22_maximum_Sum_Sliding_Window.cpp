#include<iostream>
using namespace std;
int maxSum(int arr[] , int n , int k)
{
    int curr_sum = 0;
    for(int i = 0 ; i< k ; i++)
    {
        curr_sum = curr_sum + arr[i];
    }

    int max_Sum = curr_sum;
    for(int i = k ; i <n ; i++)
    {
        curr_sum += (arr[i] - arr[i - k]);
        max_Sum = max(max_Sum , curr_sum);
    }
    return max_Sum;
}

int main()
{
    int arr[] = {1, 8, 30, -5, 20, 7};
    int n = 6;
    int k = 3;
    cout<<maxSum(arr , n , k);
}