/*
Minimum Consecutives flips to make the array equal
IP: arr[] = {1, 1, 0, 0, 0, 1}
OP: from 2 to 4

IP: arr[] = {1, 0, 0, 0, 1, 0, 0, 1, 0, 1}
OP: from 1 to 3
    from 5 to 6
    from 8 to 8
*/

#include<iostream>
using namespace std;
void printGorup(int arr[] , int n)
{
    for(int i = 1; i < n; i++)
    {
        if(arr[i] != arr[i - 1])
        {
            if(arr[i] != arr[0])
            {
                cout<<" From "<<i<<" to ";
            }
            else{
                cout<< i - 1 << endl;
            }
        }
   }
   if(arr[n - 1] != arr[0])
   {
    cout<<n - 1<<endl;
   }
}

int main()
{
    int arr[] = {1, 0, 1, 1, 0, 0, 1, 1, 0};
    int n = sizeof(arr) / sizeof(arr[0]);
    printGorup(arr , n);
}