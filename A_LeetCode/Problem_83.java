package A_LeetCode;

// ListNode class representing a node in the linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Problem_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        
        // Traverse the list until the end
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                // Skip the duplicate node
                curr.next = curr.next.next;
            } else {
                // Move to the next node if no duplicate
                curr = curr.next;
            }
        }
        
        return head;
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
        Problem_83 solution = new Problem_83();

        // Creating a list with duplicates: 1 -> 1 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        // Removing duplicates
        ListNode result = solution.deleteDuplicates(head);

        // Printing the result
        System.out.print("List after removing duplicates: ");
        solution.printList(result);
    }
}
