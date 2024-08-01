import java.util.HashMap;
import java.util.Map;
//Below is the function code

public class TwoSum01 {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        //large Time Complexity
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
        //use hastable for o(n) time complexity
        //see the solution section of it
        
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length; // Get the length of the array

        // Loop through each number in the array
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i]; // Calculate the complement
            // Check if the complement is already in the HashMap
            if (numMap.containsKey(complement)) {
                // If found, return the indices of the complement and the current number
                return new int[]{numMap.get(complement), i};
            }
            // If not found, store the current number and its index in the HashMap
            numMap.put(nums[i], i);
        }

        // If no pair is found, return an empty array
        return new int[]{};
    
}

    }

    
}
