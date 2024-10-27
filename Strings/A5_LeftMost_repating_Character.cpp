#include<iostream>
using namespace std;
/*
IP str = "abbcc"
OP = 1
IP str = "abcd"
OP = -1
*/
const int CHAR = 256;
int leftMost(string &str)
{
    bool visited[CHAR];
    fill(visited , visited + CHAR , false);
    int res = -1;
    for(int i = str.length() - 1; i >= 0 ; i--)
    {
        if(visited[str[i]])
        {
            res = i;
        }
        else{
            visited[str[i]] = true;
        }
    }
    return res;
}
int main()
{
    string str = "AdityaUniyal";
    cout<<"Index of leftMost repaeating Charcater: "<<endl;
    cout<<leftMost(str)<<endl;
    return 0;
}