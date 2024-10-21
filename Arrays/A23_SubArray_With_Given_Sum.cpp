/*
Find the Sub array with Given Sum
Ip: arr[] = {1, 4, 20, 3, 10, 6}
OP: Sum found between the indexes 2 and 4
*/
#include<iostream>
using namespace std;
int subArraySUm(int arr[] , int n , int sum)
{
    int curr_sum = arr[0];
    int start = 0;
    int i;
    for(int i = 1; i <= n ; i++)
    {
        while(curr_sum > sum && start < i - 1)
        {
            curr_sum = curr_sum - arr[start];
            start ++;
        }
    }
}