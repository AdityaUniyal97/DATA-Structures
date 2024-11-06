package Tree;
import java.util.*;
import Tree.Node;
public class B8_Balanced_tree {
    public static int isbalanced(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int lh = isbalanced(root.left);
        if(lh == -1)
        {
            return -1;
        }
        int rh = isbalanced(root.right);
        if(rh == -1)
        {
            return -1;
        }

        if(Math.abs(lh - rh) > 1)
        {
            return -1;
        }
        else{
            return Math.max(lh , rh) + 1;
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(30);
    	root.right.left=new Node(15);
    	root.right.right=new Node(20);
    	
    	if(isbalanced(root)>0)
    	    System.out.print("Balanced");
    	else
    	    System.out.print("Not Balanced");
    }
}
