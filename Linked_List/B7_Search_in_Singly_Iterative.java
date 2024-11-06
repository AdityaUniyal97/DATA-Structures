package Linked_List;
import java.util.*;
import Linked_List.Node;
public class B7_Search_in_Singly_Iterative {
    static int search(Node head , int x)
    {
        int pos = 1;
        Node curr = head;
        while(curr != null)
        {
            if(curr.data == x)
            {
                return pos;
            }
            else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }

    public static void main(String[] args) {
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
        printlist(head);
        System.out.println("Postion of element is "+search(head, 20));
    }
}
