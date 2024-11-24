#include <bits/stdc++.h>
using namespace std;
struct Node{
    int key;
    struct Node* left;
    struct Node* right;
    Node(int k)
    {
        key = k;
        left = right = NULL;
    }
};
void preordeR(Node *root)
{
    if(root != NULL)
	{
	    cout<<root->key<<" ";
	    preordeR(root->left);
	    preordeR(root->right);
	}
}
int main() {
	// your code goes here
	Node *root=new Node(10);
	root->left=new Node(20);
	root->right=new Node(30);
	root->right->left=new Node(40);
	root->right->right=new Node(50);
	preordeR(root);
}


