package leetcode_solutions.HashMap;

import java.util.HashMap;

public class RansomNote383 {
    class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Fill map1 with character counts from ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }

        // Fill map2 with character counts from magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
        }

        // Compare the two maps
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            // remember here map1.get(ch) > map2.get(ch) condition not map1.get(ch) != map2.get(ch)
            if (!map2.containsKey(ch) || map1.get(ch) > map2.get(ch)) {
                return false;
            }
        }

        return true;

    }
}

// better way but still same time complexity 
// public class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character, Integer> charCountMap = new HashMap<>();

//         // Fill charCountMap with character counts from magazine
//         for (int i = 0; i < magazine.length(); i++) {
//             char ch = magazine.charAt(i);
//             charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
//         }

//         // Check against ransomNote
//         for (int i = 0; i < ransomNote.length(); i++) {
//             char ch = ransomNote.charAt(i);
//             if (!charCountMap.containsKey(ch) || charCountMap.get(ch) == 0) {
//                 return false; // If character not present or exhausted in magazine
//             }
//             charCountMap.put(ch, charCountMap.get(ch) - 1); // Decrement the count
//         }

//         return true;
//     }

    
// }

}
