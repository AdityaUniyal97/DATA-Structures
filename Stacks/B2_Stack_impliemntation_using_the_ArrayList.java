package Stacks;
import java.util.*;
class MyStacks{
    ArrayList<Integer> al = new ArrayList<>();
    void push(int x)
    {
        al.add(x);
    }
    int pop()
    {
        int res = al.get(al.size() - 1);
        al.remove(al.size() -1 );
        return res;
    }
    int peek()
    {
        return al.get(al.size() -1);
    }
    int size()
    {
        return al.size();
    }
    boolean isEmpty()
    {
        return al.isEmpty();
    }
}
public class B2_Stack_impliemntation_using_the_ArrayList {
    public static void main(String[] args) {
        MyStacks my = new MyStacks();
        my.push(10);
        my.push(20);
        my.push(30);
        my.push(40);
        System.out.println(my.pop());
        System.out.println(my.size());
        System.out.println(my.peek());
        System.out.println(my.isEmpty());
    }
}
