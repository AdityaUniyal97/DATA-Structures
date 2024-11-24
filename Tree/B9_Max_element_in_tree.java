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
class B9_Max_element_in_tree
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Node root=new Node(20);
    	root.left=new Node(80);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
        System.out.print(getMAX(root));

	}
	
	public static int getMAX(Node root)
	{
	    if(root == null)
	    {
	        return Integer.MIN_VALUE;
	    }
	    else{
	        return Math.max(root.key , Math.max(getMAX(root.left) , getMAX(root.right)));
	    }
	}
}

