#import <iostream>
using namespace std;
void isKthSet(int n , int k)
{
    if((n & ( 1 << (k - 1))))
    {
        cout<<"SET";
    }
    else{
        cout<<"NOT SET";
    }   
}

int main()
{
    int n = 5;
    int k = 1;
    isKthSet(n , k);
    return 0;
}