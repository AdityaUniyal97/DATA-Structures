package Linked_List;
class Node{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}
public class B3_Insert_End_SingleLL {
    static Node InsertAtEnd(Node head , int x)
    {
        Node temp = new Node(x);
        if(head == null)
        {
            return temp;
        }
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertAtEnd(head, 10);
        head = InsertAtEnd(head, 20);
        head = InsertAtEnd(head, 30);
        printList(head);
    }
}
