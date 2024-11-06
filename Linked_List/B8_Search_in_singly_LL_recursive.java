package Linked_List;
import java.util.*;
import Linked_List.Node;
public class B8_Search_in_singly_LL_recursive {
    static int search(Node head , int x)
    {
        if(head == null)
        {
            return -1;
        }
        if(head.data == x)
        {
            return 1;
        }
        else{
            int res= search(head, x);
            if(res==-1)
            {
                return -1;
            }
            else{
                return res + 1;
            }
        }
    }
}
