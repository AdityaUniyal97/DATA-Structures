package Linked_List;
import java.util.*;
import Linked_List.Node;
public class B4_Insert_Position {
    static Node insertatPos(Node head , int x , int pos)
    {
        Node temp = new Node(x);
        if(head == null)
        {
            if(pos == 1)
            {
                return temp;
            }
            else{
                return head;
            }
        }
        if(pos == 1)
        {
            temp.next = head;
            return temp; // as new head;
        }
        Node curr = head;
        for(int i = 1; i < pos - 1; i++)
        {
            curr = curr.next;
            if(curr == null)
            {
                System.out.println("Position out of range");
                return head;
            }
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    void printList(Node head)
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        B4_Insert_Position ll = new B4_Insert_Position();
        ll.printList(head);
        head = ll.insertatPos(head, 25, 2);
        ll.printList(head);
    }
}