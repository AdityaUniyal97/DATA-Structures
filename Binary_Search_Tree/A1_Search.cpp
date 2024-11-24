#include <iostream>
using namespace std;

struct Node {
    int data;
    Node *left, *right;
    
    // Constructor
    Node(int k) {
        data = k;
        left = right = nullptr;  // Corrected null to nullptr
    }
};

bool search(Node *root, int x) {
    while (root != nullptr) {  // Corrected null to nullptr
        if (root->data == x) {
            return true;
        } else if (root->data < x) {
            root = root->right;  // Corrected root.left to root->right
        } else {
            root = root->left;  // Corrected root->right to root->left
        }
    }
    return false;  // Return false if not found
}

int main() {
    Node *root = new Node(15);
    root->left = new Node(5);
    root->right = new Node(20);
    root->left->left = new Node(3);
    root->right->left = new Node(18);
    root->right->left->left = new Node(16);
    root->right->right = new Node(80);

    int x = 16;
    if (search(root, x)) {
        cout << "Found";
    } else {
        cout << "Not Found";
    }

    return 0;
}
