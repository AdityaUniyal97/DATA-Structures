package Stacks;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class Stack{
    Node head;
    int sz;
    Stack()
    {
        head = null;
        sz = 0;
    }
    void push(int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        sz++;
    }
    int pop()
    {
        if(head == null)
        {
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        Node temp = head;
        head = head.next;
        sz--;
        return res;
    }
    int peek()
    {
        if(head == null)
        {
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
    int size()
    {
        return sz;
    }
    boolean isEmpty()
    {
        return head == null;
    }
}
public class B3_Stack_implementation_using_the_linked_list {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
