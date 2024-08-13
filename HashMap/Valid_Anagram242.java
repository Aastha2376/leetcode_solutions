package leetcode_solutions.HashMap;

import java.util.Arrays;

public class Valid_Anagram242 {
    // class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//         HashMap<Character,Integer> map1=new HashMap<>();
//         HashMap<Character,Integer> map2=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             Character c1=s.charAt(i);
//             Character c2=t.charAt(i);
//             if(map1.containsKey(c1)){
//                 map1.put(c1,map1.get(c1)+1);
//             }
//             else{
//                 map1.put(c1,1);
                
//             }
//             if(map2.containsKey(c2)){
//                 map2.put(c2,map2.get(c2)+1);
//             }
//             else{
//                 map2.put(c2,1);
                
//             }

//         }
//         // for(int i=0;i<s.length();i++){
//         //     Character c1=s.charAt(i);
//         //     if(!map2.containsKey(c1) || map1.get(c1)!=map2.get(c1) ){
//         //         return false;
//         //     }
//         // }
//         //why this works but above doesnt?
// //         for (Character c : map1.keySet()) {
// //     if (!map2.containsKey(c) || !map1.get(c).equals(map2.get(c))) {
// //         return false;
// //     }
// // }
//     //always use below function to chcek equality of 2 maps

//         return map1.equals(map2);
//     }
// }
//another very easy way is simple sorting faster as well

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}
}
