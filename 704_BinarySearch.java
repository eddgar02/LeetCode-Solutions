class Solution {
    public int search(int[] nums, int target) {
        int beg = 0; 
        int last = nums.length -1;

        while(beg<=last){
            int m = (last + beg) / 2;
            if(nums[m] == target){
                return m;
            }
            if(nums[m] < target){
                beg = m+1;
            } else {
                last = m -1;
            }
        }
        return -1;
    }
}
