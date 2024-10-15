#include<iostream>
using namespace std;

int main()
{
    int arr[] = {10, 4, 16, 20, 9, 1};
    int n = 6;
    int pre[n];
    pre[0] = arr[0];
    for(int i = 1; i < n ; i++)
    {
        pre[i] = pre[i - 1] + arr[i];
    }
    int q ;
    cin >> q;
    while(q--){
        int L , R;
        cin >> L >> R;
        int sum = 0;
        if(L == 0)
        {
            sum = pre[R];
        }
        else{
            sum = pre[R] - pre[L - 1];
        }
      cout << sum << endl;  
    }
    return 0;
}