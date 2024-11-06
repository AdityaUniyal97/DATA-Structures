#include<iostream>
using namespace std;
struct Node{
    int key;
    struct Node *left;
    struct Noe  *right;
    Node(int k)
    {
        key = k;
        left = right = null;
    }
};
int maxLevel = 0;
void printList(Node *root , int level)
{
    if(root == null)
    {
        return;
    }
    if(maxLevel<level)
    {
        
    }
}