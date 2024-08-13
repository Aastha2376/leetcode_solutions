package leetcode_solutions.HashMap;

import java.util.HashMap;

public class Word_Pattern290 {
    class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false; // If the number of words and pattern characters don't match
        }

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String word = words[i];

            // Check if pattern character is already mapped
            if (map.containsKey(patternChar)) {
                if (!map.get(patternChar).equals(word)) {
                    return false; // If it doesn't match the current word, return false
                }
            } else {
                // To ensure one-to-one mapping, check if the word is already mapped
                if (map.containsValue(word)) {
                    return false; // If the word is already mapped to another character, return false
                }
                map.put(patternChar, word); // Otherwise, map the character to the word
            }
        }

        return true;
    }
}
}
