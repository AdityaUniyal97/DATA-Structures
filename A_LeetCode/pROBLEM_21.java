package A_LeetCode;

class ListNode {
    int data;
    ListNode next;
    
    ListNode(int val) {
        data = val;
        next = null;
    }
}

public class pROBLEM_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // creating a dummy node which contains the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // traverse both the lists until one of them is empty
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // move to next space
        }

        // attach remaining elements from non-empty list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // return from the second element as root is 0
    }
    
    // Helper method to print the list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        pROBLEM_21 solution = new pROBLEM_21();

        // Creating first sorted list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Creating second sorted list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merging the two lists
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Printing the merged list
        System.out.print("Merged List: ");
        solution.printList(mergedList);
    }
}
