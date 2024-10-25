#include<iostream>
using namespace std;

void printUnion(int arr[], int brr[], int m, int n) {
    int i = 0; 
    int j = 0;

    // Iterate through both arrays to print the union
    while (i < m && j < n) {
        // Skip duplicate elements in arr
        if (i > 0 && arr[i - 1] == arr[i]) {
            i++;
            continue;
        }
        
        // Skip duplicate elements in brr
        if (j > 0 && brr[j - 1] == brr[j]) {
            j++;
            continue;
        }

        // If current element in arr is smaller, print and move pointer
        if (arr[i] < brr[j]) {
            cout << arr[i] << " ";
            i++;
        }
        // If current element in brr is smaller, print and move pointer
        else if (arr[i] > brr[j]) {
            cout << brr[j] << " ";
            j++;
        }
        // If elements are equal, print one of them and move both pointers
        else {
            cout << arr[i] << " ";
            i++;
            j++;
        }
    }

    // Print remaining elements in arr, skipping duplicates
    while (i < m) {
        if (i == 0 || arr[i] != arr[i - 1]) {  // Ensures no duplicates in arr
            cout << arr[i] << " ";
        }
        i++;
    }

    // Print remaining elements in brr, skipping duplicates
    while (j < n) {
        if (j == 0 || brr[j] != brr[j - 1]) {  // Ensures no duplicates in brr
            cout << brr[j] << " ";
        }
        j++;
    }
}

int main() {
    int arr[] = {3, 8, 8};  // Example array with duplicates
    int brr[] = {2, 8, 8, 10, 15};  // Example array with duplicates
    int m = sizeof(arr) / sizeof(arr[0]);
    int n = sizeof(brr) / sizeof(brr[0]);
    printUnion(arr, brr, m, n);  // Expected output: 2 3 8 10 15
    return 0;
}
