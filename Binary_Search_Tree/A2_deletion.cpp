#include<iostream>
using namespace std;
struct Node{
    int key;
    struct Node* left;
    struct Node* right;
    Node(int k)
    {
        key=k;
        left = right = null;
    }
};
Node *getSuccessor(Node*curr)
{
    curr = curr->right;
    while(curr != null &&curr -> left != null)
    {
        curr = curr->next;
    }
    return curr;
}

Node *delNode(Node *root , int x)
{
    if(root == null){
        return root;
    }
    if(root -> key > x)
    {
        root->left = delNode(root->left , x);
    }
    else if(root->key < x)
    {
        root -> right = delNode(root->right , x);
    }
    else{
        if(root -> left == NULL)
        {
            Node *temp = root-<
        }
    }
}