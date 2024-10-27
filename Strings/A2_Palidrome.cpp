#include<iostream>
using namespace std;
bool isPal(string str)
{
    int left = 0;
    int right = str.length() - 1;
    while(left < right)
    {
        if(str[left] != str[right])
        {
            return false;
        }
        left++;
        right++;
    }
    return true;
}
int main()
{
    string str = "aditya";
    cout<<isPal(str);
}