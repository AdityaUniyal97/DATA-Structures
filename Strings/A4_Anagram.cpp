#include<iostream>
using namespace std;
const int CHAR = 256;
bool isAna(string &s1 , string &s2)
{
    int n1 = s1.length();
    int n2 = s2.length();
    if(n1 != n2)
    {
        return false;
    }
    int count[CHAR] = {0};
    for(int i = 0 ; i < s1.length() ; i++)
    {
        count[s1[i]]++;
        count[s2[i]]--;
    }
    for(int i = 0 ; i < CHAR ; i++)
    {
        if(count[i] != 0)
        {
            return false;
        }
    }
    return true;
}

int main()
{
    string s1 = "abaac";
    string s2 = "aacba";
    if(isAna(s1 , s2)){
        cout<<"The two String s are Anagram";
    }
    else{
        cout<<"The two string are not Anagram";
    }
    return 0;
}