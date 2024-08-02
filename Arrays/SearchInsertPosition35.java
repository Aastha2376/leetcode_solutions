public class SearchInsertPosition35 {
    class Solution {
        // binary search for O(logn) complexity and because the array is sorted
        public int searchInsert(int[] nums, int target) {
            int high = nums.length - 1;
            int low = 0;
            
            // binary search loop
            
            while (low <=high) {
                
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            
            // return the insertion point
            return low;
        }
    }
    
}
