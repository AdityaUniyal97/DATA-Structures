#include<iostream>
using namespace std;
int main()
{
    string str = "aditya";
    int count[26] = {0};
    for(int i = 0 ; i < str.length() ; i ++)
    {
        count[str[i] - 'a']++;
    }
    for(int i =0 ; i < 26 ; i++)
    {
        if(count[i] > 0)
        {
            cout<<char(i + 'a')<<" "<<count[i]<<endl;
        }
    }
}
/*
str = "aditya"
create array and fill it with zeroes count[26] = 0

Counting Each character in"aditya"
'a' = count['a' - 'a']++(97 - 97) -> count[0]++ , count becomes 1
'd' = count['d' - 'a']++(100 - 97) -> count[3]++ , count becomes 1
'i' = count['i' - 'a']++ -> count[8]++ , count becomes 1
't' = count['t' - 'a']++ -> count[19]++ , count becomes 1
Second 'y' → count['y' - 'a']++ → count[24]++ → Count of 'y' becomes 1.
Second 'a' → count['a' - 'a']++ → count[0]++ → Count of 'a' becomes 2.
Final Counts in count[] Array:

count[0] (for 'a') = 2
count[3] (for 'd') = 1
count[8] (for 'i') = 1
count[19] (for 't') = 1
count[24] (for 'y') = 1
*/