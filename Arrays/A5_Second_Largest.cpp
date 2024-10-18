// Print the second largeast
#include<iostream>
using namespace std;
int secondLargest(int arr[] , int n)
{
    int largest = 0;
    int secondLargest = -1;
    for(int i = 1 ; i < n ; i ++)
    {
        if(arr[i] > arr[largest])
        {
            largest = i;
        }
    }

    for(int i = 0 ; i < n ; i++)
    {
        if(arr[i] != arr[largest])
        {
            if(secondLargest == -1)
            {
                secondLargest = i;
            }
            else if(arr[i] > arr[secondLargest])
            {
                secondLargest = i;
            }
        }
    }
    return secondLargest;
} 

int main()
{
    int arr[] = {12, 35, 1, 10, 34, 1};
    int n = sizeof(arr) / sizeof(arr[0]);
    int secondLarge = secondLargest(arr , n);
    if(secondLarge == -1)
    {
        cout<<"Second Largest doesnt Exists: \n";
    }
    else{
        cout<<"Second Largest: "<<arr[secondLarge];
    }
}