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
class B3_PreOrderTraversal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
    	postorder(root);
	}
	
	public static void postorder(Node root)
	{
	    if(root != null)
	    {
	        postorder(root.left);
	        postorder(root.right);
	        System.out.print(root.key+" ");
	    }
	}
}

