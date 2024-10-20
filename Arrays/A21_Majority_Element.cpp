// FInd the majority Element which appear more than n / 2 times 
/*
IP = {3, 3, 4, 2, 4, 4, 2, 4, 4}
OP = 4;
The frequency of 4 is 5 which is greater than the n / 2 size 
*/
#include<iostream>
using namespace std;
int findMajorityElememnt(int arr[] , int n)
{
    int res = 0;
    int count = 1;
    for(int i = 1;i < n ; i ++)
    {
        if(arr[res] == arr[i])
        {
            count ++;
        }
        else{
            count -- ;
        }
        if(count == 0)
        {
            res = i;
            count = 1;
        }
    }

    count = 0;
    for(int i =0 ;i < n ; i ++)
    {
        if(arr[res] == arr[i])
        {
            count++;
        }
    }
        if(count <= n / 2)
        {
            res = -1;
        }
    return res;
}

int main()
{
    int arr[] = {8, 8, 6, 6, 6 ,4, 6};
    int n = 7;
    cout<<findMajorityElememnt(arr , n)<<endl;
}
