package Tree;
import java.util.*;
import Tree.Node;
public class Inorder_PreOrder_PostOrder {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        pre_order(root);
        System.out.println();
        In_order(root);
        System.out.println();
        post_order(root);
        System.out.println();
    }

    //Pre-Order
    public static void pre_order(Node root)
    {
        if(root != null)
        {
            System.out.print(root.key+" ");
            pre_order(root.left);
            pre_order(root.right);
        }
    }

    // In-order
    public static void In_order(Node root)
    {
        if(root != null)
        {
            In_order(root.left);
            System.out.print(root.key+" ");
            In_order(root.right);
        }
    }

    //Post-Order
    public static void post_order(Node root)
    {
        if(root != null)
        {
            post_order(root.left);
            post_order(root.right);
            System.out.print(root.key+" ");
        }
    }
}
