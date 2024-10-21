// Equilibrium which number is equal from both the side
#include <iostream>
using namespace std;
int equilibrium(int arr[], int n)
{
    int sum = 0;
    int leftSum = 0;

    for (int i = 0; i < n; i++)
    {
        sum += arr[i];
    }
    for (int i = 0; i < n; i++)
    {
        sum -= arr[i];

        if (leftSum == sum)
        {
            return i;
        }

        leftSum += arr[i];
    }
    return -1;
}

int main()
{
    int arr[] = {1, 3, 5, 2, 2};
    int n = sizeof(arr) / sizeof(arr[0]);
    int result = equilibrium(arr , n);
    if (result != -1)
        cout << "Equilibrium index is " << result << endl;
    else
        cout << "No equilibrium index found" << endl;

    return 0;
}