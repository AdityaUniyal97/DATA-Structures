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
public class B16_Tree_Traversal_Spiral_Form {
    public static void main(String[] args) {
        Node root=new Node(1);
    	root.left=new Node(2);
    	root.right=new Node(3);
    	root.left.left=new Node(4);
    	root.left.right=new Node(5);
    	root.right.left=new Node(6);
    	root.right.right=new Node(7);
    	
        printSpiral(root);
    }

    public static void printSpiral(Node root){
        if(root == null)
        {
            return;
        }
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        
        s1.add(root);
        
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
        }
    }
}