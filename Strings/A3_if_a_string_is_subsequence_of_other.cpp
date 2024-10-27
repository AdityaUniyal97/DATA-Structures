#include<iostream>
using namespace std;
/*
Ip = s1 = "ABCD" , s2 = "AD"
OP = TRUE ; order did not want but the string should be subsequnce of other stirng
*/
bool isSubs(string s1 , string s2 , int n , int m)
{
    int j = 0;
    for(int i =0 ; i < n && j < m ; i++)
    {
        if(s1[i] == s2[j])
        {
           j++; 
        }
    }
    return j == m;
}
/*
s1 = "ABCD"
s2 = "AD"
INITIALLY= j = 0;
i = 0 : j = 1;
i = 1
i = 2
i = 3 : j = 2
After the loop, j = 2, which equals m = 2.
*/
int main()
{
   int n ;
   int m ;
   string s1 , s2;
   cin >> n >> m;
   cin >> s1 >> s2;
   cout<<boolalpha<<isSubs(s1, s2, n, m);
   return 0;
}