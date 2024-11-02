package Stacks;
import java.util.*;
class MyStack
{
    int arr[];
    int cap;
    int top;
    MyStack(int c)
    {
        top = -1;
        cap = c;
        arr = new int[c];
    }
    void push(int x)
    {
        if(top == cap - 1)
        {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = x;
    }
    int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");
            return 0;
        }
        int res = arr[top];
        top--;
        return res;
    }
    int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");
        }
        return arr[top];
    }
    int size()
    {
        return (top + 1);
    }
    boolean isEmpty()
    {
        return top == -1;
    }

}
public class B1_Stack_implimentation_using_the_Array {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }    
}
