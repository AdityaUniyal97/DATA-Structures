#include<iostream>
uisng namespace std;
int search(int nums[] , int n , int target)
{
    int left = 0;
    int right = n - 1;
    while(left <= right)
    {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[left] <= nums[mid])
        {
            if(nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            }
            else if(nums[left] <= target && target){
                return 
            }
        }
    }
}