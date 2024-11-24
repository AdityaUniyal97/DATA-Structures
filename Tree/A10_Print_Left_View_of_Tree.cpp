#include <bits/stdc++.h>
using namespace std;
struct Node{
    int key;
    Node *left;
    Node *right;
    Node(int k)
    {
        key = k;
        left = right = NULL;
    }
};
int maxLevel = 0;
void printList(Node *root , int level)
{
    if(root == NULL)
    {
        return;
    }
    if(maxLevel < level)
    {
        cout<<root->key<<" ";
        maxLevel = level;
    }
    printList(root->left , level + 1);
    printList(root->right , level + 1);
}

int main() {
	// your code goes here
	Node *root=new Node(10);
	root->left=new Node(20);
	root->right=new Node(30);
	root->right->left=new Node(40);
	root->right->right=new Node(50);
	printList(root , 1);
}
