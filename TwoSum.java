class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] ret = new int[2];
        for(int i = 0; i<nums.length;i++){
            
            if(hash.get(target -nums[i]) != null ){
                ret[0] = i;
                ret[1] = hash.get(target -nums[i]);
            }
            hash.put(nums[i], i);
        }
        return ret;
    }
}
