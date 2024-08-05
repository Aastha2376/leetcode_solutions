package leetcode_solutions.HashMap;

import java.util.HashSet;

public class ContainsDuplicate217 {
    class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
//Using HashMap
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer, Integer> seen = new HashMap<>();
//         for (int num : nums) {
//             if (seen.containsKey(num)) {
//                 seen.put(num, seen.get(num) + 1);
//                 if (seen.get(num) >= 2) {
//                     return true;
//                 }
//             } else {
//                 seen.put(num, 1);
//             }
//         }
//         return false;
//     }
// }
//using sorting
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         for (int i = 1; i < n; i++) {
//             if (nums[i] == nums[i - 1])
//                 return true;
//         }
//         return false;
//     }
// }

}
