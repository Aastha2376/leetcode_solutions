package leetcode_solutions.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate219 {
   //using HashMap,easier
class Solution{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i])) {
            if (i - map.get(nums[i]) <= k) return true;
        }
        map.put(nums[i], i);
    }
    return false;
}
}
//Sliding Window technique is used with a window of k
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         // Create a HashSet to store elements in the sliding window
//         HashSet<Integer> set = new HashSet<>();
        
//         // Traverse the array
//         for (int i = 0; i < nums.length; i++) {
//             // If the element is already in the set, we found a duplicate within the range
//             if (set.contains(nums[i])) {
//                 return true;
//             }
            
//             // Add the current element to the set
//             set.add(nums[i]);
            
//             // Ensure the sliding window size does not exceed k
//             //since i starts from 0;remember i>=k not i>k
//             if (i >= k) {
//                 // Remove the element that is k positions back
//                 set.remove(nums[i - k]);
//             }
//         }
        
//         // No duplicates found within the range
//         return false;
//     }
// }
}
