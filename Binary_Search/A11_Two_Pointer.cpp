#include<iostream>
using namespace std;
bool isPair(int arr[] , int n , int x)
{
    int i = 0;
    int j = n - 1;
    while(i < j)
    {
        if(arr[i] + arr[j] == x)
        {
            return true;
        }
        else if(arr[i] + arr[j] < x)
        {
            i++;
        }
        else{
            j++;
        }
    }
    return false;
}

int main()
{
    int arr[] = {2, 5, 8, 12, 30};
    int x = 17;
    int n = sizeof(arr) / sizeof(arr[0]);
    cout<<isPair(arr , n , x);
}

/*
arr[] = {2, 5, 8, 12, 30} , x = 17
Initially i = 0 , j = 4
 
 - (2 + 30) > 17 : j--(3)
 - (2 + 12) < 17 : i++(5)
 - (5 + 12) == 17 : return true;  
*/