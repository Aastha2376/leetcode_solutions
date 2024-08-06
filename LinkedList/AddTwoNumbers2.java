package leetcode_solutions.LinkedList;

public class AddTwoNumbers2 {
    
 // Definition for singly-linked list.
  public class ListNode {
      int val;
     ListNode next;
      ListNode() {}//When this constructor is called, the val and next fields are implicitly initialized to their default values.
//For int val, the default value is 0.
//For ListNode next, the default value is null.
      ListNode(int val) { this.val = val;} // here this.next is implicitly set to null because that's the default value for instance variables in Java. 
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);  // Create a dummy head node
        ListNode current = dummyHead;          // Create a pointer for traversing the result list
        int carry = 0;                         // Initialize carry to 0

        // Loop through both linked lists until there are no more nodes in both lists and no carry left
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;  // Start sum with the carry value

            // If there is a node in l1, add its value to sum and move to the next node
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // If there is a node in l2, add its value to sum and move to the next node
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;  // Calculate the new carry value
            int digit = sum % 10;  // Calculate the current digit
            // Note: In below line it will be current.next and not dummyhead.next

            current.next = new ListNode(digit);  // Create a new node with the digit value and link it
            current = current.next;  // Move the pointer to the new node
        }

        return dummyHead.next;  // Return the result list, skipping the dummy head
    }
}

}
