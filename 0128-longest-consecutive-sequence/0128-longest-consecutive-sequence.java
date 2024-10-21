import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // No elements, so no sequence
        }
        
        // Step 1: Add all elements to a HashSet for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longestStreak = 0;
        
        // Step 2: Find the longest consecutive sequence
        for (int num : set) {
            // If the previous number doesn't exist in the set, it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                // Increment the streak as long as the next consecutive number exists
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                // Update the longest streak found so far
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
}