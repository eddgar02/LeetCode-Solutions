class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> degrees = new HashMap<>();
        HashMap<Integer, Integer> firstPosition = new HashMap<>();
        HashMap<Integer, Integer> lastPosition = new HashMap<>();



        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            degrees.put(nums[i], degrees.getOrDefault(nums[i], 0) + 1);
            int cur = degrees.getOrDefault(nums[i], 0);
            if(!firstPosition.containsKey(nums[i])){
                firstPosition.put(nums[i], i);
            }
            lastPosition.put(nums[i], i);
            if(cur > max){
                max = cur;
            }
        }

        int minLen = Integer.MAX_VALUE;

        for(int key : degrees.keySet()){
            if(degrees.get(key) == max){
                int curLen = lastPosition.get(key) - firstPosition.get(key) + 1;
                if(curLen < minLen){
                    minLen = curLen;
                }
            }
        }
        if(minLen == 0){
            return 1;
        }
        return minLen;








    }

}
