package A_LeetCode;
// Remove the Dupplicate form the LL
/*
 * Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Problem_203 {
    public ListNode removeElements(ListNode head, int val) {
        // Remove all leading nodes with the specified value
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;
        
        // Traverse the list and remove nodes with the specified value
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // skip the node with the value
            } else {
                current = current.next; // move to the next node
            }
        }
        
        return head; // return the modified head
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
        Problem_203 solution = new Problem_203();

        // Creating a sample linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.print("Original List: ");
        solution.printList(head);

        // Removing elements with value 6
        ListNode modifiedList = solution.removeElements(head, 6);

        System.out.print("List after removing 6s: ");
        solution.printList(modifiedList);
    }
}
