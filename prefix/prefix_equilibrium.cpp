#include <iostream>
#include <vector>  // Required for vector
using namespace std;

class prefix_equilibrium
{
    public:
    int equilibrium(vector<long long> arr , int n)
    {
        long long sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }
        long long leftSum = 0;
        for(int i = 0; i < n; i++)
        {
            long long rightSum = sum - leftSum - arr[i];
            if(rightSum == leftSum)
            {
                return i + 1;
            }
            leftSum += arr[i];
        }
        return -1;
    }
};

int main()
{
    vector<long long> arr = {1, 3, 5, 2};
    int n = arr.size();  // Use arr.size() to get the correct size
    prefix_equilibrium obj;
    cout << obj.equilibrium(arr , n) << endl;
    return 0;
}
