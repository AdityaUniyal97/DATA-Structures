package Tree;
import Tree.Node;
import java.util.*;
public class B1_Height {
    public static int maxdepth(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else{
            return Math.max(maxdepth(root.left) , maxdepth(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println(maxdepth(root));
    }
}
