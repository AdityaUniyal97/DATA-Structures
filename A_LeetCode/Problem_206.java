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

public class Problem_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        // Traverse the list and reverse pointers
        while (curr != null) {
            ListNode next = curr.next; // temporarily store the next node
            curr.next = prev;          // reverse the current node's pointer
            prev = curr;               // move `prev` to current node
            curr = next;               // move to the next node in the original list
        }
        
        return prev; // `prev` will be the new head of the reversed list
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
        Problem_206 solution = new Problem_206();

        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        solution.printList(head);

        // Reversing the list
        ListNode reversedList = solution.reverseList(head);

        System.out.print("Reversed List: ");
        solution.printList(reversedList);
    }
}
