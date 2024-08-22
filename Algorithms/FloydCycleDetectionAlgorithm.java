package leetcode_solutions.Algorithms;

public class FloydCycleDetectionAlgorithm {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        // Constructor to create a new node
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class Solution {
        public boolean hasCycle(ListNode head) {
            // Edge case: if the list is empty or has only one node, there can't be a cycle
            if (head == null || head.next == null) {
                return false;
            }
            
            // Initialize two pointers, slow and fast
            ListNode slow = head;
            ListNode fast = head;
            
            // Traverse the list
            while (fast != null && fast.next != null) {
                slow = slow.next;           // Move slow pointer by one step
                fast = fast.next.next;      // Move fast pointer by two steps
                
                // If slow and fast meet, a cycle is detected
                if (slow == fast) {
                    return true;
                }
            }
            
            // If we reach the end of the list, there's no cycle
            return false;
        }

        public static void main(String[] args) {
            // Create a linked list: 3 -> 2 -> 0 -> -4 -> (cycle back to 2)
            ListNode head = new ListNode(3);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(0);
            ListNode node4 = new ListNode(-4);

            head.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node2;  // Creating a cycle here

            // Create an instance of the solution and check if the list has a cycle
            Solution solution = new Solution();
            boolean result = solution.hasCycle(head);

            // Print the result
            if (result) {
                System.out.println("The linked list has a cycle.");
            } else {
                System.out.println("The linked list does not have a cycle.");
            }
        }
    }
}
