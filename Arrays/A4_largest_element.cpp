//find the largest element in an Array
#include<iostream>
using namespace std;
int getLagrest(int arr[] , int n)
{
    for(int i = 0 ; i < n ; i++)
    {
        bool flag = false;
        for(int j = i ; j < n ;j ++)
        {
            if(arr[j] > arr[i])
            {
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
            return i;
        }
    }
    return -1;
}

int main()
{
    int arr[] = {5, 8, 20, 15};
    cout<<getLagrest(arr , 4);
    return 0;
}