package Tree;

import java.util.*;
import java.lang.*;
import java.io.*;
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
class B11_Children_Sim_Property
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Node root=new Node(20);
    	root.left=new Node(8);
    	root.right=new Node(12);
    	root.right.left=new Node(3);
    	root.right.right=new Node(9);
    	
        System.out.print(isCSUm(root));

	}
	
	public static boolean isCSUm(Node root)
	{
	    if(root == null)
	    {
	        return true;
	    }
	    if(root.left == null && root.right == null)
	    {
	        return true;
	    }
	    int sum = 0;
	    if(root.left != null)
	    {
	        sum += root.left.key;
	    }
	    if(root.right != null)
	    {
	        sum += root.right.key;
	    }
	    return (root.key == sum && isCSUm(root.left) && isCSUm(root.right));
	}
}

