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
class B10_Print_left_view_of_tree
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	printList(root , 1);
	}
	
	static int maxLevel = 0;
	public static void printList(Node root , int level)
	{
	    if(root == null)
	    {
	        return;
	    }
	    if(maxLevel < level)
	    {
	        System.out.print(root.key+" ");
	        maxLevel = level;
	    }
	    printList(root.left , level + 1);
	    printList(root.right , level + 1);
	}
}

