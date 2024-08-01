public class RemoveDuplicates26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            // If the array is empty, return 0
            if (nums.length == 0) {
                return 0;
            }
    
            // Initialize the counter and the second pointer.
            //ste j =1 not j=0
            int j = 1;
    
            // Loop through the array starting from the second element.
            for (int i = 1; i < nums.length; i++) {
                // If the current element is not equal to the previous element
                if (nums[i] != nums[i - 1]) {
                    // Update the value at index j and increment j
                    nums[j] = nums[i];
                    j++;
                }
            }
    
            // Return the new length of the array without duplicates
            return j;  
        }
    }
    //uding hashset worng output
    // A HashSet does not guarantee any specific order of elements, so when you copy the elements from the HashSet back to the array, they may not be in the same order as the original array
    // class Solution {
    //     public int removeDuplicates(int[] nums) {
    //         // Initialize a HashSet to store unique elements
    //         HashSet<Integer> uniqueElements = new HashSet<>();
            
    //         // Iterate through the array and add elements to the HashSet
    //         for (int i = 0; i < nums.length; i++) {
    //             uniqueElements.add(nums[i]);
    //         }
            
    //         // Copy unique elements back to the array
    //         int index = 0;
    //         for (int num : uniqueElements) {
    //             nums[index++] = num;
    //         }
            
    //         // Return the number of unique elements
    //         return uniqueElements.size();
    //     }
    // code to remove duplicates from unsorted array in O(N) Complexity
    // public class RemoveDuplicates {
    //     public static int[] removeDuplicates(int[] nums) {
    //         // Use a HashSet to store unique elements
    //         HashSet<Integer> uniqueElements = new HashSet<>();
    
    //         // Add each element to the HashSet
    //         for (int num : nums) {
    //             uniqueElements.add(num);
    //         }
    
    //         // Convert HashSet to an array
    //         int[] result = new int[uniqueElements.size()];
    //         int index = 0;
    //         for (int num : uniqueElements) {
    //             result[index++] = num;
    //         }
    
    //         return result;
    //     }
    
    //     public static void main(String[] args) {
    //         int[] nums = {4, 5, 9, 4, 2, 1, 5, 2};
    //         int[] uniqueNums = removeDuplicates(nums);
    
    //         System.out.print("Array without duplicates: ");
    //         for (int num : uniqueNums) {
    //             System.out.print(num + " ");
    //         }
    //     }
    // }
}
