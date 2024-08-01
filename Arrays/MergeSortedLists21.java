import java.util.*;
public class MergeSortedLists21 {
  
// Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // If one of the lists is empty, return the other list
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Recursive case
        if (list1.val < list2.val) {
            // list1's value is smaller, so list1's next should be merged with list2
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;  // Return list1 as the new head
        } else {
            // list2's value is smaller or equal, so list2's next should be merged with list1
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;  // Return list2 as the new head
        }
    }
}


//Brute force
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         if (list1 == null && list2 == null) return null;
//         if (list1 == null) return list2;
//         if (list2 == null) return list1;
        
//         ListNode curr = list1;
//         while (curr.next != null) {
//             curr = curr.next;
//         }
//         curr.next = list2;
        
//         ListNode head = list1;
//         ListNode curr2, curr3;
        
//         for (curr2 = head; curr2 != null && curr2.next != null; curr2 = curr2.next) {
//             for (curr3 = curr2.next; curr3 != null; curr3 = curr3.next) {
//                 if (curr2.val > curr3.val) {
//                     int temp = curr2.val;
//                     curr2.val = curr3.val;
//                     curr3.val = temp;
//                 }
//             }
//         }
        
//         return head;
//     }
// }

}
