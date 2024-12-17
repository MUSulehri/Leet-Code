class Solution {
    private void reccursiveMethod (int[] nums, int i, List<Integer> current, List<List<Integer>> result) {
        if (nums.length == i) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        current.add(nums[i]);
        reccursiveMethod (nums, i+1, current, result);
        current.remove(current.size()-1);
        reccursiveMethod (nums, i+1, current, result);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        reccursiveMethod (nums,0,current,result);
        
        return result;
    }
}