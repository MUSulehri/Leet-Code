class Solution {
    
    private int countZeros(int[] nums) {
        
        int size = nums.length;
        int count = 0;
        
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) count++;
        }
        
        return count;
    }
    
    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;
        int [] answer = new int [size];
        int product = 1;
        int countZeros =  countZeros(nums);
        
        for (int i = 0; i < size; i++)
        {
            if (nums[i] != 0)
                product = product * nums[i];
        }
        
        for (int i = 0; i < size; i++)
        {
            if (countZeros < 2) {
                if (nums[i] != 0 && countZeros == 0)
                    answer[i] = product / nums[i];
                else if (nums[i] != 0 && countZeros == 1)
                    answer[i] = 0;
                else
                    answer[i] = product;
            }
            else
                answer[i] = 0;
        }
        
        return answer;
        
    }
}