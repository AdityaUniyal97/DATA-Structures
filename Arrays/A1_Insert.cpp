#include<iostream>
using namespace std;
int insert(int arr[] , int n, int x,  int cap , int pos)
{
    if(n == cap)
    {
        return n;
    }

    int inx = pos - 1;
    for(int i = n - 1; i >= inx ; i--)
    {
        arr[i + 1] = arr[i];
    }
    arr[inx] = x;
    return n + 1;
}

int main()
{
    int arr[5] ;
    int cap = 5;
    int n = 3;
    arr[0] = 5;
    arr[1] = 10;
    arr[2] = 20;
    cout<<"Before Insertion"<<endl;
    for(int i =0 ; i < n ; i++)
    {
        cout<<arr[i]<<" ";
    }
    
    int x = 7;
    int pos = 2;
    n = insert(arr , n , x , cap, pos);
    cout<<"After insertion:=> "<<endl;
    for(int i =0 ; i < n ; i ++)
    {
        cout<<arr[i]<<" ";
    }
}