// Find the leader in ana array
// Input = 16, 17, 4, 3, 5, 2
// Output = 17, 5, 2

#include<iostream>
using namespace std;
void leader(int arr[] , int n)
{
	int curr_ldr = arr[n - 1];
	cout<<curr_ldr<<" ";
	for(int i = n - 2; i >= 0 ; i --)
	{
		if(curr_ldr < arr[i])
		{
			curr_ldr = arr[i];
			cout<<curr_ldr<<" ";
		}
	}
}

int main()
{
	int arr[] = {7, 10, 4, 3, 5,12,55,3,23};
	int n = sizeof(arr) / sizeof(arr[0]);
	leader(arr , n);
}