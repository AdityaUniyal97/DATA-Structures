package Tree;
import java.util.*; 

class Node{
    int key;
    Node left;
    Node right;
    Node(int k)
    {
        key= k;
        left = right = null;
    }
}
public class B18_Lowest_Common_Ancestor {
    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    }

    public static Node LCA(Node root , int n1 , int n2)
    {
        if(root == null)
        {
            return null;
        }
        if(root.key == n1 || root.key == n2)
        {
            return root;
        }
        Node lca1 = LCA(root.left, n1, n2);
        Node lca2 = LCA(root.right , n1 , n2);

        if(lca1 != null && lca2 != null)
        {
            return root;
        }
        if(lca1 != null)
        {
            return lca1;
        }
        else{
            return lca2;
        }
    }
}
