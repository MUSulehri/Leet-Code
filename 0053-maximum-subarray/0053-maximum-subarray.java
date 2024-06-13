class Solution {
    public int maxSubArray(int[] nums) {
        int finalMax = Integer.MIN_VALUE, currMax = 0;
        if (nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            currMax = currMax + nums[i];
            if (finalMax < currMax) finalMax = currMax;
            if (currMax < 0) currMax = 0;
        }
        
        return finalMax;
    }
}