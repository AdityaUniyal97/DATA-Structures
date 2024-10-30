package A_LeetCode;
/*
 * Input: head = [1,2,3,4]
Output: [1,4,2,3]
 */
public class Problem_143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return; // No need to reorder if the list is empty or has only one node
        }

        // Step 1: Find the middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow by one step
            fast = fast.next.next;    // Move fast by two steps
        }

        // At this point, slow is at the midpoint of the list

        // Step 2: Reverse the second half of the list
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; // Split the list into two halves
        while (curr != null) {
            ListNode nextNode = curr.next; // Temporarily store the next node
            curr.next = prev;              // Reverse the link
            prev = curr;                   // Move prev forward
            curr = nextNode;               // Move curr forward
        }
        // Now prev is the head of the reversed second half

        // Step 3: Merge the two halves
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            ListNode temp1 = first.next;  // Temporarily store the next nodes
            ListNode temp2 = second.next;
            
            first.next = second;          // Link first part to second part
            second.next = temp1;          // Link reversed second part to first part

            first = temp1;                // Move first pointer forward
            second = temp2;               // Move second pointer forward
        }
    }
}
