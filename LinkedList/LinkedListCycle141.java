package leetcode_solutions.LinkedList;

import java.util.HashSet;

public class LinkedListCycle141 {

//Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
 


public class Solution {
    public boolean hasCycle(ListNode head) {
        // If the list is empty or has only one node, it cannot have a cycle
        if(head == null || head.next == null) {
            return false;
        }

        // Use a HashSet to keep track of visited nodes
//         Using a HashSet<Integer> to detect cycles in a linked list based on the values of the nodes (i.e., checking if a value repeats) can work in some cases. However, there are some caveats:

// Value Collisions: If the list contains nodes with the same value but in different positions (e.g., 1 -> 2 -> 3 -> 1 without a cycle), this approach might incorrectly detect a cycle because it checks for repeating values rather than actual node references.

// False Positives: The approach can give false positives if there are multiple nodes with the same value but no cycle.
        HashSet<ListNode> visitedNodes = new HashSet<>();

        // Traverse the linked list
        // even though head.next will work prefer head!=null
        while(head!= null) {
            // If the current node has been visited before, a cycle is detected
            if(visitedNodes.contains(head)) {
                return true; 
            } else {
                // Add the current node to the set
                visitedNodes.add(head);
            }
            // Move to the next node
            head = head.next;
        }

        // If we traverse the whole list without revisiting any node, there is no cycle
        return false;
    }
}

}
