package Tree;

import java.util.*;
import java.lang.*;
import java.io.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
class B4_height_of_Tree
{
    Node root;
    static int maxDepth(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else{
            int ldepth = maxDepth(root.left);
            int rdepth = maxDepth(root.right);
            
            if(ldepth > rdepth)
            {
                return (ldepth + 1);
            }
            else{
                return (rdepth + 1);
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		B4_height_of_Tree obj = new B4_height_of_Tree();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		
		System.out.println("Height of Tree is "+maxDepth(obj.root));

	}
}
