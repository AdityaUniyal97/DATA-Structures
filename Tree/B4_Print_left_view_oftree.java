package Tree;
import Tree.Node;
public class B4_Print_left_view_oftree {
    static int maxLevel = 0;
    public static void printLeft(Node root , int level)
    {
        if(root == null)
        {
            return;
        }
        if(maxLevel < level)
        {
            System.out.print(root.key + " , ");
            maxLevel = level;
        }
        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left=  new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        printLeft(root, 1);
    }
}
