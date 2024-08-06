package leetcode_solutions.HashMap;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {
    //here we are using the sliding window technique (important)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //using HashSet
         
        // // Create a set to keep track of characters in the current substring
        // Set<Character> charSet = new HashSet<>();
        // int left = 0; // Start of the substring
        // int maxLength = 0; // Length of the longest substring

        // // Loop through each character in the string
        // for (int right = 0; right < s.length(); right++) {
        //     // If character is already in the set, remove characters from the left
        //     while (charSet.contains(s.charAt(right))) {
        //         charSet.remove(s.charAt(left));
        //         left++; // Move the start of the substring to the right
        //     }
        //     // Add the current character to the set
        //     charSet.add(s.charAt(right));
        //     // Update the maximum length of substring
        //     maxLength = Math.max(maxLength, right - left + 1);
        // }

        // return maxLength; // Return the length of the longest substring
    




    //Using HashMap

    // Initialize variables
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        
        // Expand the window
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            
            // Shrink the window if character is already in the map
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= left) {
                left = charMap.get(currentChar) + 1;
            }
            
            // Add/update the character's position in the map
            charMap.put(currentChar, right);
            
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
     
    }
}
}
