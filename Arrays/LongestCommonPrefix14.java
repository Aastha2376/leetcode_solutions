import java.util.Arrays;

public class LongestCommonPrefix14 {
    class Solution {
    public String longestCommonPrefix(String[] v) {
        // Step 1: Create a place to store the common prefix
        StringBuilder ans = new StringBuilder();
        
        // Step 2: Sort the array alphabetically
        Arrays.sort(v);
        
        // Step 3: Take the first and last strings from the sorted array
        String first = v[0];
        String last = v[v.length - 1];
        
        // Step 4: Compare characters of the first and last strings
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                // If characters don't match, stop and return what we have
                return ans.toString();
            }
            // If characters match, add to the common prefix
            ans.append(first.charAt(i));
        }
        
        // Step 5: Return the final common prefix
        return ans.toString();
    }
}


//Bubble sort to sort strings ..use compareto()
// public class SimpleSort {
//     public static void bubbleSort(String[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j].compareTo(arr[j + 1]) > 0) {
//                     // Swap arr[j] and arr[j + 1]
//                     String temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         String[] arr = {"apple", "banana", "grape", "cherry"};
//         bubbleSort(arr);
//         for (String s : arr) {
//             System.out.println(s);
//         }
//     }
// }

}
