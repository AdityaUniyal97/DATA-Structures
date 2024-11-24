package Tree;

import java.util.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

class B14_Binary_tree_to_Double_Linked_List {
    static Node prev = null;

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        Node head = BTtoDLL(root);
        printList(head);
    }

    public static Node BTtoDLL(Node root) {
        if (root == null) {
            return null;
        }

       
        Node head = BTtoDLL(root.left);

        if (prev == null) {
            head = root; 
        } else {
            root.left = prev; 
            prev.right = root;
        }
        prev = root; 
        BTtoDLL(root.right);

        return head; 
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.key + " ");
            curr = curr.right;
        }
    }
}
