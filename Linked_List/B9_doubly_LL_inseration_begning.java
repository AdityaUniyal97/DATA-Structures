package Linked_List;
import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int d)
    {
        data = d;
        next = prev = null;
    }
}
public class B9_doubly_LL_inseration_begning {
    public static Node insertBegin(Node head , int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        if(head != null)
        {
            head.prev = temp;
        }
        return temp;
    }

    public static void printlist(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
    	head=insertBegin(head,5);
    	printlist(head);
    }
}
