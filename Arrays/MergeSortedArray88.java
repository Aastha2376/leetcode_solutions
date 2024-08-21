public class MergeSortedArray88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // Create a new array to store the merged result
            int[] arr = new int[m + n];
            int i = 0;  
            int j = 0;  
            int k = 0;  // Pointer for the merged array
    
            // Merge the two arrays until one is exhausted
            while (i < m && j < n) {
                if (nums1[i] <= nums2[j]) {
                    arr[k] = nums1[i];
                    i++;
                } else {
                    arr[k] = nums2[j];
                    j++;
                }
                k++;
            }
    
            // If there are remaining elements in nums1, add them to arr
            while (i < m) {
                arr[k] = nums1[i];
                i++;
                k++;
            }
    
            // If there are remaining elements in nums2, add them to arr
            while (j < n) {
                arr[k] = nums2[j];
                j++;
                k++;
            }
    
            // Copy the merged elements back into nums1
            for (int l = 0; l < m + n; l++) {
                nums1[l] = arr[l];
            }
        }
    }
    
}
