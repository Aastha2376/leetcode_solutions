public class RemoveElement27 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0; // Pointer to place non-val elements
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    }
    //Brute force;class Solution {
    //     public int removeElement(int[] nums, int val) {
    //         int s = nums.length;
    //         for (int i = 0; i < s; i++) {
    //             if (nums[i] == val) {
    //                 for (int j = i; j < s - 1; j++) {
    //                     nums[j] = nums[j + 1]; // Shift elements left
    //                 }
    //                 s--; // Decrease the size
    //                 i--; // Stay at the same index for the next iteration
    //             }
    //         }
    //         return s;
    //     }
    // }
}
