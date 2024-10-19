#include<iostream>
using namespace std;

void reverse(int arr[] , int low , int high)
{
	while(low < high)
	{
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		low++;
		high --;
	}
}

void lrotate(int arr[] , int d , int n)
{
	reverse(arr , 0 , d - 1);
	reverse(arr , d , n - 1);
	reverse(arr , 0 , n - 1);
}

int main()
{
	int arr[] = {1, 2, 3, 4 ,5 ,6};
	int n = sizeof(arr) / sizeof(arr[0]);
	lrotate(arr , 2 , n);
	for(int i =0 ; i < n ; i ++)
	{
		cout<<arr[i]<<" ";
	}
}