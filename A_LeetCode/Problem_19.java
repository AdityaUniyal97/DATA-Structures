package A_LeetCode;

// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Problem_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node and set it as the previous node of head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // Move fast pointer n+1 steps ahead
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        // Move both fast and slow pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from end
        slow.next = slow.next.next;
        
        return dummy.next; // Return the modified list, starting from head
    }
    
    // Helper method to print the list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Problem_19 solution = new Problem_19();

        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        solution.printList(head);

        // Removing the 2nd node from the end
        ListNode modifiedList = solution.removeNthFromEnd(head, 2);

        System.out.print("List after removing 2nd node from end: ");
        solution.printList(modifiedList);
    }
}
