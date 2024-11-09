package Tree;
import java.util.*;
class Node{
    int key;
    Node left;
    Node right;
    Node(int k)
    {
        key = k;
        left = right = null;
    }
}
public class B9_Convert_BTree_to_Doubly_LL {
    static Node prev = null;
    public static Node BtoDll(Node root)
    {
        if(root == null)
        {
            return root;
        }
        Node head = BtoDll(root.left);
        if(prev == null)
        {
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BtoDll(root.right);
        return head;
    }

    public static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.key+" ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(20);
    	root.right.left=new Node(30);
        root.right.right=new Node(35);

        Node head = BtoDll(root);
        printList(head);
    }
}
