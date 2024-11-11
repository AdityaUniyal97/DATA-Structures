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
public class B13_Count_all_nodes_of_Tree {
    public static int countNode(Node root)
    {
        int lh = 0;
        int rh = 0;
        Node curr = root;
        while(curr != null)
        {
            lh++;
            curr = curr.left;
        }
        while(curr != null)
        {
            rh++;
            curr = curr.right;
        }
        if(lh == rh)
        {
            return (int)Math.pow(2 , lh) - 1;
        }
        else{
            return 1 + countNode(root.left) + countNode(root.right);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
    	System.out.print(countNode(root));
    }
}
