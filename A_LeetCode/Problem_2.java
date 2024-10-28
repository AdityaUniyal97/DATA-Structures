package A_LeetCode;
import java.util.*;

// Define the ListNode class to represent each node in the linked list
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem_2 {

    // Method to add two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head node to simplify the code
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0; // Initialize carry to handle sums greater than 9
        
        // Loop through both lists as long as there are nodes in either l1 or l2
        while (l1 != null || l2 != null) {
            // If l1 is not null, use its value; otherwise, use 0
            int x = (l1 != null) ? l1.val : 0;
            
            // If l2 is not null, use its value; otherwise, use 0
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate the sum of the current digits plus carry
            int sum = x + y + carry;
            
            // Update carry for the next iteration
            carry = sum / 10;
            
            // Create a new node with the digit part of the sum
            current.next = new ListNode(sum % 10);
            
            // Move the current pointer to the next node
            current = current.next;
            
            // Move to the next nodes in l1 and l2 if they are not null
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // If there is any carry left after the final addition, add it as a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        // Return the next node to dummy head (head of the actual result list)
        return dummyHead.next;
    }
 
    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create two linked lists for testing: l1 = [2, 4, 3] and l2 = [5, 6, 4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Solution instance to call addTwoNumbers method
        Problem_2 solution = new Problem_2();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result list
        printList(result);  // Expected output: 7 -> 0 -> 8
    }
}
