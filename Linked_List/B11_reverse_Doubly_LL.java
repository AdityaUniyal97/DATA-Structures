package Linked_List;
import java.util.*;
import Linked_List.Node;
public class B11_reverse_Doubly_LL {
    static Node reverse(Node head)
    {
        Node temp  = null;
        Node curr = head;
        while(curr != null)
        {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp != null)
        {
            head = temp.prev;
        }
        return head;
    }

    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
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
        head=reverse(head);
        printlist(head);
    }
}
