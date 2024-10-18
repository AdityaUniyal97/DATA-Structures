#include<iostream>
using namespace std;

void printSub(string str , string curr , int index)
{
    if(index == str.length())
    {
        cout<<curr<<" ";
        return;
    }
    printSub(str , curr , i++);
    printSub(str , curr+str[index] , i++);
}

int main()
{
    String str = "ABC";
    printSub(n);
    return 0;
}