#include<iostream>
using namespace std;
void insertion(int arr[] , int brr[] , int m , int n)
{
    int i = 0;
    int j = 0;
    while(i < m && j < n)
    {
        if(i > 0 && arr[i - 1] == arr[i])
        {
            i++;
            continue;
        }
        if(arr[i] < brr[j])
        {
            i++;
        }
        else if(arr[i] > brr[j])
        {
            j++;
        }
        else{
            cout<<arr[i]<<" ";
            i++;
            j++;
        }
    }
}

int main()
{
    int arr[] = {3, 5, 10, 10, 10, 15, 15, 20};
    int brr[] = {5, 10, 10, 15, 30};
    int m = sizeof(arr) / sizeof(arr[0]);
    int n = sizeof(brr) / sizeof(brr[0]);
    insertion(arr , brr , m , n);
}

/*
arr[] = {10 , 20 , 20 , 40 , 60}
brr[] = {2 , 20 , 20 , 20}
INITIALLY = i = 0 , j = 0
I : j - 1
II : i - 1
III : print(20) , i = 2 , j = 2
IV : (arr[i] == arr[i - 1]) , so => i = 3
V :  j = 3
VI : j = 4
*/