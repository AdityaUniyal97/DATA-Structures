package Tree;
import java.util.*;
import Tree.Node;
public class B7_maximum_in_b_tree {
    public static int getmax(Node root)
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.key , Math.max(getmax(root.left),getmax(root.right)));
        }
    }

    public static void main(String[] args) {
        Node root=new Node(20);
    	root.left=new Node(80);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);

        System.out.println(getmax(root));
    }
}