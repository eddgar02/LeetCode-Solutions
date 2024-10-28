class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();

        for(int i = 0; i<nums.length;i++){
            int j = 0;
            if(ret.size() == 0){
                ret.add(new ArrayList<>());
            }
            while(ret.get(j).contains(nums[i])){
                j++;
                if(ret.size() == j){
                    ret.add(new ArrayList<>());
                    break;
                }
            }
            ret.get(j).add(nums[i]);
        }
        return ret;
    }
}
