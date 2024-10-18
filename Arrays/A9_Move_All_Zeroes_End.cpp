#include<iostream>
using namespace std;

void push_zeroes(std::vector<int>& arr)
{
    std::stable_partition(arr.begin(), arr.end(),[](int n){
        return n != 0;
    });
}

int main()
{
    std::vector<int> arr{1,9,8,4,0,0,2,7,0,6,0,9};
    push_zeroes(arr);
    for(const auto& i : arr)
    {
        std::cout<<i<<' ';
    }
    std::cout<<"\n";
    return 0;
}