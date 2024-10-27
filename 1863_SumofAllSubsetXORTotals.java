class Solution {
    public int subsetXORSum(int[] nums) {
        int[] sum = new int[1];
        backtrack(nums, sum, 0, 0);
        return sum[0];
    }

    public void backtrack(int[] nums, int[] sum, int start, int rolling){
        sum[0] += rolling;
        for(int i = start; i<nums.length;i++){
            backtrack(nums, sum, i+1, rolling ^nums[i]);
        }
    }
}
