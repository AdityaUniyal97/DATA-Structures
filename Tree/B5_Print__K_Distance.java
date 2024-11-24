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
class B5_Print__K_Distance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.right=new Node(70);
    	root.right.right.right=new Node(80);
    	int k=2;
    	printKDist(root , k);
	}
	
	public static void printKDist(Node root , int k)
	{
	    if(root == null)
	    {
	        return ;
	    }
	    if(k == 0)
	    {
	        System.out.print(root.key+" ");
	    }
	    else{
	        printKDist(root.left,k - 1);
	        printKDist(root.right, k - 1);
	    }
	}
}
