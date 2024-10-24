import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        int finalCount = 0;
        
        for (int num : nums) set.add(num);
        
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int incremented = num + 1;
                int counter = 1;

                while (set.contains(incremented)) {
                    counter ++;
                    incremented ++;
                }

                if (counter > finalCount) finalCount = counter;

            }
        };
        
        return finalCount;
    }
}