#include<iostream>
#include<unordered_set>
using namespace std;

int countDistinct(int arr[])
{
    unordered_set<int> us;
    for(int x : arr)
    {
        us.insert(x);
    }
    cout<<us;
    return us.size();
}

int main()
{
    int arr[] = {15, 16, 27, 27, 28, 15};
    cout<<countDistinct(arr);
}