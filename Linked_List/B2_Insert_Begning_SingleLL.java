package Linked_List;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}
public class B2_Insert_Begning_SingleLL {
    static Node insertAtBegning(Node head , int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertAtBegning(head, 10);
        head = insertAtBegning(head, 20);
        head = insertAtBegning(head, 30);

        printList(head);
    }
}
