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
class B6_level_order_traversal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
    	
        levelOrderTraversal(root);
	}
	
	public static void levelOrderTraversal(Node root)
	{
	    if(root == null)
	    {
	        return ;
	    }
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    while(q.isEmpty() == false)
	    {
	        Node curr = q.poll();
	        System.out.print(curr.key+" ");
	        if(curr.left != null)
	        {
	            q.add(curr.left);
	        }
	        if(curr.right != null)
	        {
	            q.add(curr.right);
	        }
	    }
	}
}

