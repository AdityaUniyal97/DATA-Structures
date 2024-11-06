package Linked_List;
import java.util.*;
import Linked_List.Node;
public class B5_delete_first_node {
    static Node delHead(Node head)
    {
        if(head == null)
        {
            return null;
        }
        else{
            return head = head.next;
        }
    }

    public static void printList(Node head)
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
    	head.next=new Node(20);
    	head.next.next=new Node(30); 
        printList(head);
        head = delHead(head);
        printList(head);
    }
}
