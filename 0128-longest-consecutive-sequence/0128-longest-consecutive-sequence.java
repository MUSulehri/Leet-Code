import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        int finalCount = 0;
        
        Arrays.stream(nums).forEach(num -> set.add(num));
        
        for (int num : nums) {
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