// check whaether the given sum is an subset or not
#include<iostream>
using namesapce std;
int countSubset(int arr[] , int n , int sum)
{
    if(n == 0)
    {
        return sum = 0 ? 1 : 0;
    }

    return countSubset(arr , n - 1, sum) + countSubset(arr , n - 1, sum - arr[n - 1]);

}

int main()
{
    int n = 3;
    int arr[] = {10, 20, 15};
    int sum = 25;
    cout<<countSubset(arr , n , sum);
    return 0;
}