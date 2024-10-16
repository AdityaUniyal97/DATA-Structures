#include<iostream>
using namespace std;
bool isPal(string str , int start , int end)
{
    if(start >= end)
    {
        return true;
    }
    return ((str[start] == str[end]) && isPal(str , start + 1, end - 1));
}

int main()
{
    string str = "Aditya";
    int start = 0;
    int end = str.length() - 1;
    cout<<isPal(str , start , end);
}