/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head to make it easier to return the result
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null) {
            // Get the values (0 if the node is null)
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Add values and carry
            int sum = x + y + carry;
            carry = sum / 10;

            // Create a new node with the digit value
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's a carry left, add a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the result, skipping the dummy head
        return dummyHead.next;
    }
}
