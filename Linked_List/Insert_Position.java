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
public class Insert_Position {
    static Node insertPos(Node head , int x , int pos)
    {
        Node temp = new Node(x);
        if(head == null) // if head is null
        {
            if(pos == 1) // if the head is null and pos 1
            {
                return temp;
            }
            else{ // else pos is somewhere else but the head else 
                return head;
            }
        }
        if(pos == 1)
        {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i = 1; i < pos - 1; i++)
        {
            curr = curr.next;
            if(curr == null)
            {
                System.out.println("Position out of rnage :  ");
                return temp;
            }
        }
    }
}
